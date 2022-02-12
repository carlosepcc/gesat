package com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud;
import com.example.gesat.repositorio.entidad.ReporteT;
import com.example.gesat.repositorio.entidad.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AddEstadoRevisorRequest {
    private Integer id;
    private String estado;
    private User revisor;
    
    public AddEstadoRevisorRequest() {
    }
    public Integer getId() {
        return id;
    }
    public String getEstado() {
        return estado;
    }
    public User getRevisor() {
        return revisor;
    }
    @JsonIgnore
    public ReporteT addEstadoRevisor(ReporteT reporte){
        reporte.setId(this.id);
        reporte.setEstado(this.estado);
        reporte.setRevisor(this.revisor);
        return reporte;
    }
}
