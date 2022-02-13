package com.example.gesat.controlador.respuesta.ReporteTRespuesta;
import java.time.LocalDate;

import com.example.gesat.repositorio.entidad.ReporteT;
import com.example.gesat.repositorio.entidad.User;

public class EstadoRevisorResponse {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String estado;
    private User revisor;
    private String tipo;
    private Integer evaluacion;
    private Integer attribute;
    private LocalDate fechaI;
    private LocalDate fechaC;
    
    
    
    public EstadoRevisorResponse(ReporteT reporte) {
        this.id=reporte.getId();
        this.nombre=reporte.getNombre();
        this.descripcion=reporte.getDescripcion();
        this.estado=reporte.getEstado();
        this.revisor=reporte.getRevisor();
        this.tipo=reporte.getTipo();
        this.fechaI=reporte.getFechaI();
        this.fechaC=reporte.getFechaC();
        this.attribute=reporte.getAttribute();
        this.evaluacion=reporte.getEvaluacion();
        
    }
    
    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getEstado() {
        return estado;
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
    
    public User getRevisor() {
        return revisor;
    }

    public Integer getEvaluacion() {
        return evaluacion;
    }
    public Integer getAttribute() {
        return attribute;
    }
}
