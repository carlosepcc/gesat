package com.example.gesat.servicio;

import com.example.gesat.controlador.respuesta.UsuarioResponse;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.NewUsuarioRequest;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.UpUsuarioRequest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UsuarioResponse> listar();
    UsuarioResponse listarPorID(Integer id);
    UsuarioResponse save(NewUsuarioRequest usuario);
    void delete(Integer[] ids);
    UsuarioResponse edit(UpUsuarioRequest usuario);

    

}
