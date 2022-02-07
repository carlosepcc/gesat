package com.example.gesat.repositorio.entidad;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Hallazgo extends Entidad{
    @Column
    private String productoAf;
    @Column
    private String ubicacion;
    @Column
    private String descripcion;
    @Column
    private Integer tipo;
    @Column
    private Date fecha;
    @Column
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

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImpacto() {
        return impacto;
    }

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }

    

}