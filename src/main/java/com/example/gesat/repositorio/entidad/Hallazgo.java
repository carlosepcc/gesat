package com.example.gesat.repositorio.entidad;
import java.time.LocalDate;
import javax.persistence.*;
@Table(name = "hallazgos")
@Entity
public class Hallazgo extends Entidad{
    @Column(nullable = false)
    private String productoAf;
    @Column(nullable = false)
    private String ubicacion;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private String impacto;
  
    public Hallazgo() {
    }

    public String getProductoAf() {
        return productoAf;
    }

    public void setProductoAf(String productoAf) {
        this.productoAf = productoAf;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getImpacto() {
        return impacto;
    }

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }

    

}