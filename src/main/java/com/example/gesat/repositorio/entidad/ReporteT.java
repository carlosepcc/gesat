package com.example.gesat.repositorio.entidad;
import java.time.LocalDate;

import javax.persistence.*;
@Table(name = "reporte_Tecnico")
@Entity
public class ReporteT extends Entidad{
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private String estado;
    @Column
    private String tipo;
    @Column
    private LocalDate fechaI;
    @Column
    private LocalDate fechaC;
    @Column
    private Integer evaluacion;
  
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

    public String getTipo() {
        return tipo;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Integer evaluacion) {
        this.evaluacion = evaluacion;
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
