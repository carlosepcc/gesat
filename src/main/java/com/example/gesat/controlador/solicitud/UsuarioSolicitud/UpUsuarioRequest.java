package com.example.gesat.controlador.solicitud.UsuarioSolicitud;
import java.util.List;

import com.example.gesat.repositorio.entidad.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UpUsuarioRequest {
    private Integer id;
    private String username;
    private String apellidos;
    private String pass;
    private List<Users.Rol> roles;
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

    public List<Users.Rol> getRoles() {
        return roles;
    }

    @JsonIgnore
    public Users upUsuario() {
        Users usuario = new Users();
        usuario.setId(id);
        usuario.setUsername(this.username);
        usuario.addRol(Users.Rol.Usuario);
        roles.forEach(rol -> {
            usuario.addRol(rol);
        });
        usuario.setApellidos(this.apellidos);
        usuario.setPass(this.pass);
        usuario.setNombre(this.nombre);
        return usuario;
    }
}
