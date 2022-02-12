package com.example.gesat.servicio.implementacion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.gesat.controlador.respuesta.MinutaResponse;
import com.example.gesat.controlador.solicitud.MinutaSolicitud.NewMinutaRequest;
import com.example.gesat.controlador.solicitud.MinutaSolicitud.UpMinutaRequest;
import com.example.gesat.repositorio.IMinutaRepository;
import com.example.gesat.servicio.MinutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IMinutaService implements MinutaService {

    
    @Autowired
    private IMinutaRepository repository;

    @Override
    public List<MinutaResponse> findAll() {
        return repository
                .findAll()
                .parallelStream()
                .map(MinutaResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public MinutaResponse findByID(Integer id) {
        return new MinutaResponse(repository.getById(id));
    }

    @Override
    public MinutaResponse save(NewMinutaRequest minuta) {
        return new MinutaResponse(repository.save(minuta.toMinuta()));
    }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids)
                .forEach(id -> {
                    repository.deleteById(id);
                });
    }

    @Override
    public MinutaResponse edit(UpMinutaRequest minuta) {
        return new MinutaResponse(repository.save(minuta.upMinuta()));
    }
    
    
}
