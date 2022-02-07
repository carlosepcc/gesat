package com.example.gesat.controlador.solicitud;

import java.util.Date;

import com.example.gesat.repositorio.entidad.Hallazgo;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewHallazgoRequest {
    private String productoAf;
    private String ubicacion;
    private String descripcion;
    private Integer tipo;
    private Date fecha;
    private String impacto;
   
    public NewHallazgoRequest() {
    }

    public String getProductoAf() {
        return productoAf;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Integer getTipo() {
        return tipo;
    }
   public Date getFecha() {
        return fecha;
    }
     public String getImpacto() {
        return impacto;
    }

    @JsonIgnore
    public Hallazgo toHallazgo(){
        Hallazgo hallazgo= new Hallazgo();
        hallazgo.setProductoAf(this.productoAf);
        hallazgo.setUbicacion(this.ubicacion);
        hallazgo.setDescripcion(this.descripcion);
        hallazgo.setFecha(this.fecha);
        hallazgo.setTipo(this.tipo);
        hallazgo.setImpacto(this.impacto);
        return hallazgo;
    }
    
}
