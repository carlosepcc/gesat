package com.example.gesat.servicio;

import com.example.gesat.controlador.respuesta.UsuarioResponse;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.NewUsuarioRequest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    List<UsuarioResponse> listar();
    UsuarioResponse listarPorID(Integer id);
    UsuarioResponse save(NewUsuarioRequest usuario);
    void delete(Integer[] ids);
    UsuarioResponse edit(NewUsuarioRequest usuario);

    

}
