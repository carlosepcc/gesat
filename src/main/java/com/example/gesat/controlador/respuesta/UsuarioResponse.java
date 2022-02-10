package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.Rol;
import com.example.gesat.repositorio.entidad.User;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioResponse {

    private Integer id;

    private String username;
    private String apellidos;
    private String pass;
    private List<String> roles;
    private String nombre;
    public UsuarioResponse() {
    }

    public UsuarioResponse(User usuario) {
        this.id = usuario.getId();
        this.username = usuario.getUsername();
        usuario.getRoles().remove(Rol.Usuario);
        this.roles = usuario.getRoles().parallelStream().map(Enum::name).collect(Collectors.toList());
        this.apellidos=usuario.getApellidos();
        this.pass=usuario.getPass();
        this.nombre=usuario.getNombre();
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return pass;
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
