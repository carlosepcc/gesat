package com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import com.example.gesat.repositorio.entidad.ReporteT;

public class NewReporteTRequest {
    private String nombre;
    private String descripcion;
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
    
    public LocalDate getFechaI() {
        return fechaI;
    }

    public LocalDate getFechaC() {
        return fechaC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaI(LocalDate fechaI) {
        this.fechaI = fechaI;
    }

    public void setFechaC(LocalDate fechaC) {
        this.fechaC = fechaC;
    }

    @JsonIgnore
    public ReporteT toReporteT(){
        ReporteT reporte= new ReporteT();
        reporte.setNombre(this.nombre);
        reporte.setDescripcion(this.descripcion);
        reporte.setFechaI(this.fechaI);
        reporte.setFechaC(this.fechaC);
        reporte.setEstado("Creado");
        return reporte;
    }
    
}
