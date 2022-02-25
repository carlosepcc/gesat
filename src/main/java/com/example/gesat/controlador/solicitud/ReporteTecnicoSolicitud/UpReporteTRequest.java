package com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import com.example.gesat.repositorio.entidad.ReporteT;

public class UpReporteTRequest {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String tipo;
    private LocalDate fechaI;
    private LocalDate fechaC;
    private Integer evaluacion;
    
    
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
    public LocalDate getFechaI() {
        return fechaI;
    }
    public LocalDate getFechaC() {
        return fechaC;
    }
    public Integer getEvaluacion() {
        return evaluacion;
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
        return reporte;
    }
    
}
