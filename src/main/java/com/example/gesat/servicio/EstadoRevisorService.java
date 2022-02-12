package com.example.gesat.servicio;
import com.example.gesat.controlador.respuesta.ReporteTRespuesta.EstadoRevisorResponse;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.AddEstadoRevisorRequest;

import org.springframework.stereotype.Service;

@Service
public interface EstadoRevisorService {
    EstadoRevisorResponse agregarEstadoRevisor(AddEstadoRevisorRequest reporte);
}
