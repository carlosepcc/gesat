package com.example.gesat.servicio;

import java.util.List;
import com.example.gesat.controlador.respuesta.ArtefactoResponse;
import com.example.gesat.controlador.solicitud.ArtefactoSolicitud.NewArtefactoRequest;
import com.example.gesat.controlador.solicitud.ArtefactoSolicitud.UpArtefactoRequest;
import com.example.gesat.repositorio.entidad.Artefacto;

import org.springframework.stereotype.Service;
@Service
public interface ArtefactService  {
    List<ArtefactoResponse> findAll();
    ArtefactoResponse findByID(Integer id);
    ArtefactoResponse save(NewArtefactoRequest artefacto) throws Exception;
    void delete(Integer[] ids);
    ArtefactoResponse edit(UpArtefactoRequest artefacto);
    Artefacto getByNombre(String nombre);   
}
