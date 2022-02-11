package com.example.gesat.servicio.implementacion;

import com.example.gesat.controlador.respuesta.ReporteTResponse;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.AddEstadoRevisor;
import com.example.gesat.servicio.EstadoRevisorService;
import org.springframework.stereotype.Service;

@Service
public class IEstadoRevisorService implements EstadoRevisorService {
   
    @Override
    public ReporteTResponse agregarEstadoRevisor(AddEstadoRevisor reporteT) {
        
        return new ReporteTResponse(reporteT.addEstadoRevisor());
    }

}
