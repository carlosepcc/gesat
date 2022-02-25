package com.example.gesat.servicio;

import com.example.gesat.controlador.respuesta.UsuarioResponse;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.NewUsuarioRequest;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.UpUsuarioRequest;
import com.example.gesat.repositorio.entidad.Users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UsuarioResponse> findAll();
    List<UsuarioResponse> findByRol(String rol);
    UsuarioResponse findByID(Integer id);
    UsuarioResponse save(NewUsuarioRequest usuario) throws Exception;
    void delete(Integer[] ids);
    UsuarioResponse edit(UpUsuarioRequest usuario);
    Users getByUsuario(String username);
    

}
