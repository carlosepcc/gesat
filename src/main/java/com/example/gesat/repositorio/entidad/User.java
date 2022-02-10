package com.example.gesat.repositorio.entidad;
import javax.persistence.*;
import java.util.List;
@Table(name= "users")
@Entity
public class User extends Entidad {
   
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String username;
    @Column
    private String pass;
    @Column
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Rol> roles;

    public User() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public Integer getId() {
        return this.getId();
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addRol(Rol rol) {
        this.roles.add(rol);
    }
}
