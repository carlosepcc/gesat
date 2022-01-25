package com.example.gesat.controlador.solicitud;

import com.example.gesat.repositorio.entidad.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewUsuarioRequest {
    private String username;

    public String getUsername() {
        return username;
    }

    @JsonIgnore
    public Usuario toUsuario() {
        Usuario usuario = new Usuario();
        usuario.setUsername(this.username);
        usuario.addRol(Usuario.Rol.Usuario);
        return usuario;
    }
}
