package com.example.gesat.repositorio.entidad;

import javax.persistence.*;

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
    
}