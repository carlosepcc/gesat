package com.example.gesat.controlador.respuesta.ReporteTRespuesta;
import java.time.LocalDate;

import com.example.gesat.repositorio.entidad.ReporteT;
import com.example.gesat.repositorio.entidad.Users;

public class EstadoRevisorResponse {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String estado;
    private Users revisor;
    private String tipo;
    private Integer evaluacion;
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
    
    public Users getRevisor() {
        return revisor;
    }

    public Integer getEvaluacion() {
        return evaluacion;
    }
}
