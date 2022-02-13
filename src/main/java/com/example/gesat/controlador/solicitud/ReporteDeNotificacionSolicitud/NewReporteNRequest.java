package com.example.gesat.controlador.solicitud.ReporteDeNotificacionSolicitud;
import java.util.Date;

import com.example.gesat.repositorio.entidad.ReporteN;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewReporteNRequest {

    private String producto;
    private String nombre;
    private String fase;
    private String disciplina;
    private Integer local;
    private Date fecha;
    private String hora;
    private String descripcion;

    public NewReporteNRequest(){
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

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDescripcion() {
        return descripcion;
    }
    @JsonIgnore
    public ReporteN toReporteN(){
       ReporteN reporte=new ReporteN();
       reporte.setProducto(this.producto);
       reporte.setNombre(this.nombre);
       reporte.setFase(this.fase);
       reporte.setDisciplina(this.disciplina);
       reporte.setDescripcion(this.descripcion);
       reporte.setFecha(this.fecha);
       reporte.setHora(this.hora);
       reporte.setLocal(this.local);
        return reporte;
    }

}
