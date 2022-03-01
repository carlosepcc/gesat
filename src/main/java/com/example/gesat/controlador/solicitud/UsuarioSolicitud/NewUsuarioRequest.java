package com.example.gesat.controlador.solicitud.UsuarioSolicitud;

import java.util.List;
import com.example.gesat.repositorio.entidad.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class NewUsuarioRequest {

    private String nombre;
    private String apellidos;
    private String username;
    private String pass;
    private List<Users.Rol> roles;
    

  PasswordEncoder encoder= new BCryptPasswordEncoder();

    
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

    public List<Users.Rol> getRoles() {
        return roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setRoles(List<Users.Rol> roles) {
        this.roles = roles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonIgnore
    public Users toUsuario() {
        Users usuario = new Users();
        usuario.setUsername(this.username);
        roles.forEach(rol -> {
            usuario.addRol(rol);
        });
        usuario.setApellidos(this.apellidos);
        usuario.setPass(encoder.encode(this.pass));
        usuario.setNombre(this.nombre);
        return usuario;
    }
}
