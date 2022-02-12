package com.example.gesat.servicio.implementacion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.gesat.controlador.respuesta.DictamenTResponse;
import com.example.gesat.controlador.solicitud.DictamenTSolicitud.NewDictamenTRequest;
import com.example.gesat.controlador.solicitud.DictamenTSolicitud.UpDictamenTRequest;
import com.example.gesat.repositorio.IDictamenTRepository;
import com.example.gesat.servicio.DictamenTService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IDictamenTService implements DictamenTService {

    @Autowired
    IDictamenTRepository repository;

    @Override
    public List<DictamenTResponse> findAll() {
        return repository
                .findAll()
                .parallelStream()
                .map(DictamenTResponse::new)
                .collect(Collectors.toList());
    }


    @Override
    public DictamenTResponse findByID(Integer id) {
        return new DictamenTResponse(repository.getById(id));
    }

    @Override
    public DictamenTResponse save(NewDictamenTRequest dictamenT) {
        return new DictamenTResponse(repository.save(dictamenT.toDictamenT()));
    }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids)
                .forEach(id -> {
                    repository.deleteById(id);
                });
    }

    @Override
    public DictamenTResponse edit(UpDictamenTRequest dictamenT) {
        return new DictamenTResponse(repository.save(dictamenT.upDictamenT()));
    }
    
}
