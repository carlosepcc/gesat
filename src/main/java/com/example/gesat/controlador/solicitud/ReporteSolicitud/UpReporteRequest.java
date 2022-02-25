package com.example.gesat.controlador.solicitud.ReporteSolicitud;

import java.time.LocalDate;
//import com.example.gesat.repositorio.IHallazgoRepository;
import com.example.gesat.repositorio.IReporteTRepository;
import com.example.gesat.repositorio.entidad.Reporte;
import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.beans.factory.annotation.Autowired;

public class UpReporteRequest {
    private Integer id;
    private String namereport;
    private LocalDate fecha;
    
    @Autowired
    private IReporteTRepository reportesT;
    // @Autowired
    // private IHallazgoRepository hallazgos;

    public Integer getId(){
        return id;
    }
    public String getNamereport() {
        return namereport;
    }
    public LocalDate getFecha(){
        return fecha;
    }

    @JsonIgnore
    public Reporte upReporte(){
        Reporte reporte= new Reporte();
        reporte.setId(this.id);
        reporte.setNamereport(this.namereport);
       // reporte.setHallazgos(this.hallazgos.findAllByFecha(fecha));
        reporte.setReportesT(this.reportesT.findAllByFechaI(fecha));
        return reporte;
    }
}
