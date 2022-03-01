package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.Users;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioResponse {

    private Integer id;
    private String username;
    private String apellidos;
    private List<String> roles;
    private String nombre;

    public UsuarioResponse() {
    }

    public UsuarioResponse(Users usuario) {
        this.id = usuario.getId();
        this.username = usuario.getUsername();
        this.roles = usuario.getRoles().parallelStream().map(Enum::name).collect(Collectors.toList());
        this.apellidos = usuario.getApellidos();
        this.nombre = usuario.getNombre();
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
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
