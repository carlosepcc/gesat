package com.example.gesat.controlador.solicitud;

import java.util.List;

import com.example.gesat.repositorio.entidad.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewUsuarioRequest {
    private String username;
    private String apellidos;
    private String pass;
    private List<Usuario.Rol> roles;
    private String nombre;

    public NewUsuarioRequest() {
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
        usuario.setApellidos(this.apellidos);
        usuario.setPass(this.pass);
        usuario.setNombre(this.nombre);
        return usuario;
    }
}
