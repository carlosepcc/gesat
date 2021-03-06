package com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import com.example.gesat.repositorio.entidad.ReporteT;
import com.example.gesat.repositorio.entidad.Users;

public class UpReporteTRequest {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String estado;
    private Users revisor;
    private LocalDate fechaI;
    private LocalDate fechaC;
    
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
    public LocalDate getFechaI() {
        return fechaI;
    }
    public LocalDate getFechaC() {
        return fechaC;
    }
    public void setId(Integer id) {
        this.id = id;
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
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Users getRevisor() {
        return revisor;
    }
    public void setRevisor(Users revisor) {
        this.revisor = revisor;
    }
    @JsonIgnore
    public ReporteT upReporteT(){
        ReporteT reporte= new ReporteT();
        reporte.setId(this.id);
        reporte.setNombre(this.nombre);
        reporte.setDescripcion(this.descripcion);
        reporte.setEstado(this.estado);
        reporte.setRevisor(this.revisor);
        reporte.setFechaI(this.fechaI);
        reporte.setFechaC(this.fechaC);
       
        return reporte;
    }
    
}
