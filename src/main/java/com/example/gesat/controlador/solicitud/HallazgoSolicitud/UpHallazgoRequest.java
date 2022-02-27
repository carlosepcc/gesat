package com.example.gesat.controlador.solicitud.HallazgoSolicitud;
import java.time.LocalDate;

import com.example.gesat.repositorio.entidad.Hallazgo;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UpHallazgoRequest {
    private Integer id;
    private String productoAf;
    private String ubicacion;
    private String descripcion;
    private String tipo;
    private LocalDate fecha;
    private String impacto;
   
    public UpHallazgoRequest() {
    }
    public Integer getId(){
        return this.id;
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
    public String getTipo() {
        return tipo;
    }
   public LocalDate getFecha() {
        return fecha;
    }
     public String getImpacto() {
        return impacto;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setProductoAf(String productoAf) {
        this.productoAf = productoAf;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }
    @JsonIgnore
    public Hallazgo upHallazgo(){
        Hallazgo hallazgo= new Hallazgo();
        hallazgo.setId(id);
        hallazgo.setProductoAf(this.productoAf);
        hallazgo.setUbicacion(this.ubicacion);
        hallazgo.setDescripcion(this.descripcion);
        hallazgo.setFecha(this.fecha);
        hallazgo.setTipo(this.tipo);
        hallazgo.setImpacto(this.impacto);
        return hallazgo;
    }
    
}
