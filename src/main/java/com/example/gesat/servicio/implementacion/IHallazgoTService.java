package com.example.gesat.servicio.implementacion;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.example.gesat.controlador.respuesta.HallazgoResponse;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.NewHallazgoRequest;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.UpHallazgoRequest;
import com.example.gesat.repositorio.IHallazgoRepository;
import com.example.gesat.servicio.HallazgoTService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IHallazgoTService implements HallazgoTService {

    @Autowired
    IHallazgoRepository repository;

    @Override
    public List<HallazgoResponse> findAll() {
        return repository
                .findAll()
                .parallelStream()
                .map(HallazgoResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public HallazgoResponse findByID(Integer id) {
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
