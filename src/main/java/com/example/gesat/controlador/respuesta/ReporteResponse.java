package com.example.gesat.controlador.respuesta;

import java.util.List;
import java.util.stream.Collectors;

import com.example.gesat.repositorio.entidad.Hallazgo;
import com.example.gesat.repositorio.entidad.Reporte;
import com.example.gesat.repositorio.entidad.ReporteT;

public class ReporteResponse {
    private String namereport;
    private List<String> reportesT;
    private List<String> hallazgos;
   
    public ReporteResponse(Reporte reporte) {
        this.namereport=reporte.getNamereport();
        this.reportesT=reporte.getReportesT().stream().map(ReporteT::getNombre).collect(Collectors.toList());
        this.hallazgos=reporte.getHallazgos().stream().map(Hallazgo::getProductoAf).collect(Collectors.toList());
    }

    public String getNamereport() {
        return namereport;
    }

    public List<String> getReportesT() {
        return reportesT;
    }
    public List<String> getHallazgos() {
        return hallazgos;
    }


}
