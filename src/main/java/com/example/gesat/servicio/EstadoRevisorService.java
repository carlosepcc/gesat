package com.example.gesat.servicio;
import com.example.gesat.controlador.respuesta.ReporteTResponse;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.AddEstadoRevisor;

import org.springframework.stereotype.Service;

@Service
public interface EstadoRevisorService {
    ReporteTResponse agregarEstadoRevisor(AddEstadoRevisor reporteT);
}
