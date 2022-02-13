package com.example.gesat.servicio;

import java.util.List;

import com.example.gesat.controlador.respuesta.ReporteNResponse;
import com.example.gesat.controlador.solicitud.ReporteDeNotificacionSolicitud.NewReporteNRequest;
import com.example.gesat.controlador.solicitud.ReporteDeNotificacionSolicitud.UpReporteNRequest;

import org.springframework.stereotype.Service;

@Service
public interface ReporteNService {
    List<ReporteNResponse> findAll();
    ReporteNResponse findByID(Integer id);
    ReporteNResponse save(NewReporteNRequest reporte);
    void delete(Integer[] ids);
    ReporteNResponse edit(UpReporteNRequest reporte);
}
