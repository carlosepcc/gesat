package com.example.gesat.repositorio.entidad;

import java.util.Date;

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
    private Date fechaI;
    @Column
    private Date fechaC;
    @Column
    private Integer evaluacion;
    @Column
    private Integer attribute;
    
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
    

    public Date getFechaI() {
        return fechaI;
    }

    public void setFechaI(Date fechaI) {
        this.fechaI = fechaI;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public void setFechaC(Date fechaC) {
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
    public Integer getAttribute() {
        return attribute;
    }
    public void setAttribute(Integer attribute) {
        this.attribute = attribute;
    }
    public User getRevisor() {
        return revisor;
    }

    public void setRevisor(User revisor) {
        this.revisor = revisor;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="revisor_id")
    private User revisor;

}
