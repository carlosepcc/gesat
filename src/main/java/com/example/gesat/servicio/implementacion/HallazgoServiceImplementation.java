package com.example.gesat.servicio.implementacion;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.example.gesat.controlador.respuesta.HallazgoResponse;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.NewHallazgoRequest;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.UpHallazgoRequest;
import com.example.gesat.repositorio.HallazgoRepository;
import com.example.gesat.servicio.HallazgoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HallazgoServiceImplementation implements HallazgoService {

    @Autowired
    HallazgoRepository repository;

    @Override
    public List<HallazgoResponse> listar() {
        return repository
                .findAll()
                .parallelStream()
                .map(HallazgoResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public HallazgoResponse listarPorID(Integer id) {
        return new HallazgoResponse(repository.getById(id));
    }

    @Override
    public HallazgoResponse save(NewHallazgoRequest artefacto) {
        return new HallazgoResponse(repository.save(artefacto.toHallazgo()));
    }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids)
                .forEach(id -> {
                    repository.deleteById(id);
                });
    }

    @Override
    public HallazgoResponse edit(UpHallazgoRequest artefacto) {
         return new HallazgoResponse(repository.save(artefacto.upHallazgo()));
    }
    
}
