package com.example.gesat.repositorio.entidad;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name= "users")
@Entity
public class Users extends Entidad {
    public enum Rol {Administrador, Coordinador_de_calidad, Asesor_de_calidad, Encargado_de_proyecto, Revisor}

    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String username;
    @Column
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "role_id"))
    private List<Rol> roles = new ArrayList<>();

    public Users() {
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
        return password;
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public List<Rol> getRoles() {
        return roles;
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
