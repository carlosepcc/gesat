package com.example.gesat.controlador.solicitud.UsuarioSolicitud;

import java.util.List;

import com.example.gesat.repositorio.entidad.Rol;
import com.example.gesat.repositorio.entidad.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UpUsuarioRequest {
    private Integer id;
    private String username;
    private String apellidos;
    private String pass;
    private List<Rol> roles;
    private String nombre;

    public UpUsuarioRequest() {
    }
    
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Rol> getRoles() {
        return roles;
    }
    @JsonIgnore
    public User upUsuario() {
        User usuario = new User();
        usuario.getId();
        usuario.setUsername(this.username);
        usuario.addRol(Rol.Usuario);
        roles.forEach(rol -> {
            usuario.addRol(rol);
        });
        usuario.setApellidos(this.apellidos);
        usuario.setPass(this.pass);
        usuario.setNombre(this.nombre);
        return usuario;
    }
}
