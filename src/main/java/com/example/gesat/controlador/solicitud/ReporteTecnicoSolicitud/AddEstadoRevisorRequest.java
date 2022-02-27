package com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud;
import com.example.gesat.repositorio.entidad.ReporteT;
import com.example.gesat.repositorio.entidad.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AddEstadoRevisorRequest {
    private Integer id;
    private String estado;
    private Users revisor;
    
    public AddEstadoRevisorRequest() {
    }
    public Integer getId() {
        return id;
    }
    public String getEstado() {
        return estado;
    }
    public Users getRevisor() {
        return revisor;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setRevisor(Users revisor) {
        this.revisor = revisor;
    }
    @JsonIgnore
    public ReporteT addEstadoRevisor(ReporteT reporte){
        reporte.setId(this.id);
        reporte.setEstado(this.estado);
        reporte.setRevisor(this.revisor);
        return reporte;
    }
}
