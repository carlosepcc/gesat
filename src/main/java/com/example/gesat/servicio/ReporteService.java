package com.example.gesat.servicio;

import java.util.List;

import com.example.gesat.controlador.respuesta.ReporteResponse;
import com.example.gesat.controlador.solicitud.ReporteSolicitud.NewReporteRequest;
import com.example.gesat.controlador.solicitud.ReporteSolicitud.UpReporteRequest;

import org.springframework.stereotype.Service;

@Service
public interface ReporteService {
    List<ReporteResponse> findAll();
    ReporteResponse findByID(Integer id);
    ReporteResponse save(NewReporteRequest reporte);
    void delete(Integer[] ids);
    ReporteResponse edit(UpReporteRequest reporte);
}
