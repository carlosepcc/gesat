package com.example.gesat.controlador.solicitud.HallazgoSolicitud;



import java.time.LocalDate;

import com.example.gesat.repositorio.entidad.Hallazgo;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewHallazgoRequest {
    private String productoAf;
    private String ubicacion;
    private String descripcion;
    private String tipo;
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

    public String getTipo() {
        return tipo;
    }

    public String getImpacto() {
        return impacto;
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

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }

    @JsonIgnore
    public Hallazgo toHallazgo() {
        Hallazgo hallazgo = new Hallazgo();
        hallazgo.setProductoAf(this.productoAf);
        hallazgo.setUbicacion(this.ubicacion);
        hallazgo.setDescripcion(this.descripcion);
        hallazgo.setFecha(LocalDate.now());
        hallazgo.setTipo(this.tipo);
        hallazgo.setImpacto(this.impacto);
        return hallazgo;
    }

}
