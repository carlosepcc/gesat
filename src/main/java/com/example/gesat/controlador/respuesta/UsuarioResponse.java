package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioResponse {

    private Integer id;

    private String username;

    private List<String> roles;

    public UsuarioResponse() {
    }

    public UsuarioResponse(Usuario usuario) {
        this.id = usuario.getId();
        this.username = usuario.getUsername();
        this.roles = usuario.getRoles().stream().map(Enum::name).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
