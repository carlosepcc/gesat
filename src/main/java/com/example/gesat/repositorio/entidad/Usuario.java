package com.example.gesat.repositorio.entidad;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario extends Entidad {

    public enum Rol {
        Administrador, Coordinador_de_calidad, Asesor_de_calidad, Encargado_de_proyecto, Revisor, Usuario
    }

    @Column
    private String username;
    @Column
    private String apellidos;
    @Column
    private String nombre;
    @Column()
    private String pass;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    @CollectionTable(name = "usuario_roles", joinColumns = @JoinColumn(name = "role_id"))
    private List<Rol> roles = new ArrayList<>();
    
    public Usuario() {
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
