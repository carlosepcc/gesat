package com.example.gesat.servicio.implementacion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.gesat.controlador.respuesta.ArtefactoResponse;
import com.example.gesat.controlador.solicitud.NewArtefactoRequest;
import com.example.gesat.repositorio.ArtefactoRepository;
import com.example.gesat.repositorio.entidad.Artefacto;
import com.example.gesat.servicio.ArtefactoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtefactoServiceImplementation implements ArtefactoService {

    @Autowired
    private ArtefactoRepository repository;

    @Override
    public List<ArtefactoResponse> listar() {
        return repository
                .findAll()
                .parallelStream()
                .map(ArtefactoResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public ArtefactoResponse save(NewArtefactoRequest artefacto) {
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
        public ArtefactoResponse edit(NewArtefactoRequest artefacto) {
            Artefacto u = artefacto.toArtefacto();
            repository.getById(u.getId()).setNombre(u.getNombre());
            repository.getById(u.getId()).setFase(u.getFase());
            repository.getById(u.getId()).setDisciplina(u.getDisciplina());
            repository.getById(u.getId()).setDescripcion(u.getDescripcion());
            return new ArtefactoResponse(repository.getById(u.getId()));
        }

        @Override
        public ArtefactoResponse listarPorID(Integer id) {
                return new ArtefactoResponse(repository.getById(id));
        }
    

}
