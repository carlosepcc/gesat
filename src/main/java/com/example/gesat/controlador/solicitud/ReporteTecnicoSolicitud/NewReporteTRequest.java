package com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import com.example.gesat.repositorio.entidad.ReporteT;

public class NewReporteTRequest {
    private String nombre;
    private String descripcion;
    private String tipo;
    private Integer evaluacion;
    private Integer attribute;
    private LocalDate fechaI;
    private LocalDate fechaC;
    
    
    public NewReporteTRequest() {
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
    
    public LocalDate getFechaI() {
        return fechaI;
    }

    public LocalDate getFechaC() {
        return fechaC;
    }

    public Integer getEvaluacion() {
        return evaluacion;
    }
    public Integer getAttribute() {
        return attribute;
    }
    @JsonIgnore
    public ReporteT toReporteT(){
        ReporteT reporte= new ReporteT();
        reporte.setNombre(this.nombre);
        reporte.setDescripcion(this.descripcion);
        reporte.setTipo(this.tipo);
        reporte.setEvaluacion(this.evaluacion);
        reporte.setAttribute(this.attribute);
        reporte.setFechaI(this.fechaI);
        reporte.setFechaC(this.fechaC);
        return reporte;
    }
    
}
