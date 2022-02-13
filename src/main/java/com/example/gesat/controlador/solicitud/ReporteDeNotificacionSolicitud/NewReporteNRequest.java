package com.example.gesat.controlador.solicitud.ReporteDeNotificacionSolicitud;

import java.time.LocalDate;

import com.example.gesat.repositorio.entidad.ReporteN;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewReporteNRequest {

    private String producto;
    private String nombre;
    private String fase;
    private String disciplina;
    private Integer local;
    private Integer h;
    private Integer m;
    private String descripcion;

    public NewReporteNRequest() {
    }

    public String getProducto() {
        return producto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFase() {
        return fase;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Integer getLocal() {
        return local;
    }

    public Integer getH() {
        return h;
    }

    public Integer getM() {
        return m;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @JsonIgnore
    public ReporteN toReporteN() {
        ReporteN reporte = new ReporteN();
        reporte.setProducto(this.producto);
        reporte.setNombre(this.nombre);
        reporte.setFase(this.fase);
        reporte.setDisciplina(this.disciplina);
        reporte.setDescripcion(this.descripcion);
        reporte.setFecha(LocalDate.now());
        reporte.setHora(this.h, this.m);
        reporte.setLocal(this.local);
        return reporte;
    }

}
