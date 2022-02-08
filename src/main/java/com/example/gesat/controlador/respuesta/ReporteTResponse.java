package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.ReporteT;

public class ReporteTResponse {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String estado;
    private String tipo;
    private Integer evaluacion;
    private Integer attribute;
    
    
    public ReporteTResponse(ReporteT reporte) {
        this.id=reporte.getId();
        this.nombre=reporte.getNombre();
        this.descripcion=reporte.getDescripcion();
        this.estado=reporte.getEstado();
        this.tipo=reporte.getTipo();
        this.attribute=reporte.getAttribute();
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
    public Integer getEvaluacion() {
        return evaluacion;
    }
    public Integer getAttribute() {
        return attribute;
    }
}
