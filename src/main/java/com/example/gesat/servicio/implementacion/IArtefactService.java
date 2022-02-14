package com.example.gesat.servicio.implementacion;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.gesat.controlador.respuesta.ArtefactoResponse;
import com.example.gesat.controlador.solicitud.ArtefactoSolicitud.NewArtefactoRequest;
import com.example.gesat.controlador.solicitud.ArtefactoSolicitud.UpArtefactoRequest;
import com.example.gesat.repositorio.IArtefactRepository;
import com.example.gesat.servicio.ArtefactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IArtefactService implements ArtefactService {

    @Autowired
    private IArtefactRepository repository;

    @Override
    public List<ArtefactoResponse> findAll() {
        return repository
                .findAll()
                .parallelStream()
                .map(ArtefactoResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public ArtefactoResponse save(NewArtefactoRequest artefacto) throws IOException {
        return new ArtefactoResponse(repository.save(artefacto.toArtefacto()));
    }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids)
                .forEach(id -> {
                    repository.deleteById(id);
                });
    }

        @Override
        public ArtefactoResponse findByID(Integer id) {
                return new ArtefactoResponse(repository.getById(id));
        }

        @Override
        public ArtefactoResponse edit(UpArtefactoRequest artefacto) throws IOException {
            return new ArtefactoResponse(repository.save(artefacto.upArtefacto()));
        }
    

}
