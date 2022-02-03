package com.example.gesat.controlador.solicitud;

import java.util.List;

import com.example.gesat.repositorio.entidad.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewUsuarioRequest {
    private String username;

    private List<Usuario.Rol> roles;

    public NewUsuarioRequest() {
    }

    public String getUsername() {
        return username;
    }

    public List<Usuario.Rol> getRoles() {
        return roles;
    }

    @JsonIgnore
    public Usuario toUsuario() {
        Usuario usuario = new Usuario();
        usuario.setUsername(this.username);
        usuario.addRol(Usuario.Rol.Usuario);
        roles.forEach(rol -> {
            usuario.addRol(rol);
        });
        return usuario;
    }
}
