package com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import com.example.gesat.repositorio.entidad.ReporteT;

public class UpReporteTRequest {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String tipo;
    private Date fechaI;
    private Date fechaC;
    private Integer evaluacion;
    private Integer attribute;
    
    
    public UpReporteTRequest() {
    }
    public Integer getId(){
        return this.id;
    }
    public String getNombre() {
        return nombre;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
    public String getTipo() {
        return tipo;
    }
    public Date getFechaI() {
        return fechaI;
    }
    public Date getFechaC() {
        return fechaC;
    }
    public Integer getEvaluacion() {
        return evaluacion;
    }
    public Integer getAttribute() {
        return attribute;
    }
    @JsonIgnore
    public ReporteT upReporteT(){
        ReporteT reporte= new ReporteT();
        reporte.setId(this.id);
        reporte.setNombre(this.nombre);
        reporte.setDescripcion(this.descripcion);
        reporte.setTipo(this.tipo);
        reporte.setFechaI(this.fechaI);
        reporte.setFechaC(this.fechaC);
        reporte.setEvaluacion(this.evaluacion);
        reporte.setAttribute(this.attribute);
        return reporte;
    }
    
}
