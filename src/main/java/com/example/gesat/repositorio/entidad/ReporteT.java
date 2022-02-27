package com.example.gesat.repositorio.entidad;
import java.time.LocalDate;

import javax.persistence.*;
@Table(name = "reporte_Tecnico")
@Entity
public class ReporteT extends Entidad{
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String descripcion;
    @Column
    private String estado;
    @Column(nullable = false)
    private LocalDate fechaI;
    @Column(nullable = false)
    private LocalDate fechaC;
  
    public ReporteT() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  

    public LocalDate getFechaI() {
        return fechaI;
    }

    public void setFechaI(LocalDate fechaI) {
        this.fechaI = fechaI;
    }

    public LocalDate getFechaC() {
        return fechaC;
    }

    public void setFechaC(LocalDate fechaC) {
        this.fechaC = fechaC;
    }

    public Users getRevisor() {
        return revisor;
    }

    public void setRevisor(Users revisor) {
        this.revisor = revisor;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="revisor_id")
    private Users revisor;

}
