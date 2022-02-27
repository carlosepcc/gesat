package com.example.gesat.controlador.respuesta.ReporteTRespuesta;
import java.time.LocalDate;
import com.example.gesat.repositorio.entidad.ReporteT;
public class ReporteTResponse {
    private Integer id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaI;
    private LocalDate fechaC;
    
    public ReporteTResponse(ReporteT reporte) {
        this.id=reporte.getId();
        this.nombre=reporte.getNombre();
        this.descripcion=reporte.getDescripcion();
        this.fechaI=reporte.getFechaI();
        this.fechaC=reporte.getFechaC();
        
        
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
    public LocalDate getFechaI() {
        return fechaI;
    }
    public LocalDate getFechaC() {
        return fechaC;
    }
}
