package com.example.gesat.controlador.respuesta.ReporteTRespuesta;
import java.util.Date;
import com.example.gesat.repositorio.entidad.ReporteT;
public class ReporteTResponse {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String tipo;
    private Integer evaluacion;
    private Integer attribute;
    private Date fechaI;
    private Date fechaC;
    
    
    
    public ReporteTResponse(ReporteT reporte) {
        this.id=reporte.getId();
        this.nombre=reporte.getNombre();
        this.descripcion=reporte.getDescripcion();
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
    public String getTipo() {
        return tipo;
    }

    public Date getFechaI() {
        return fechaI;
    }
    public Date getFechaC() {
        return fechaC;
    }
    public Integer getEvaluacion() {
        return evaluacion;
    }
    public Integer getAttribute() {
        return attribute;
    }
}
