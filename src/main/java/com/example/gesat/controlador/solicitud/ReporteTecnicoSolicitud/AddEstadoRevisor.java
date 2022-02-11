package com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud;
import com.example.gesat.repositorio.entidad.ReporteT;
import com.example.gesat.repositorio.entidad.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AddEstadoRevisor {
    private Integer id;
    private String estado;
    

    public AddEstadoRevisor() {
    }
    public Integer getId() {
        return id;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public User getRevisor() {
        return Revisor;
    }

    @JsonIgnore
    public ReporteT addEstadoRevisor(){
        ReporteT reporte= new ReporteT();
        reporte.setId(this.id);
        reporte.setEstado(this.estado);
        
        return reporte;
    }
}
