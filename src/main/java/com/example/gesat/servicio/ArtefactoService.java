package com.example.gesat.servicio;

import java.util.List;

import com.example.gesat.controlador.respuesta.ArtefactoResponse;
import com.example.gesat.controlador.solicitud.NewArtefactoRequest;

import org.springframework.stereotype.Service;
@Service
public interface ArtefactoService  {
    List<ArtefactoResponse> listar();
  
    ArtefactoResponse save(NewArtefactoRequest artefacto);
    
    void delete(Integer[] ids);
    
    ArtefactoResponse edit(NewArtefactoRequest artefacto);
}
