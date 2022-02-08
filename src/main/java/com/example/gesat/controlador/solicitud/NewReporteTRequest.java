package com.example.gesat.controlador.solicitud;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.gesat.repositorio.entidad.ReporteT;

public class NewReporteTRequest {
    private String nombre;
    private String descripcion;
    private String estado;
    private String tipo;
    private Integer evaluacion;
    private Integer attribute;
    
    
    public NewReporteTRequest() {
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
    @JsonIgnore
    public ReporteT toReporteT(){
        ReporteT reporte= new ReporteT();
        reporte.setNombre(this.nombre);
        reporte.setDescripcion(this.descripcion);
        reporte.setEstado(this.estado);
        reporte.setTipo(this.tipo);
        reporte.setEvaluacion(this.evaluacion);
        reporte.setAttribute(this.attribute);
        return reporte;
    }
    
}
