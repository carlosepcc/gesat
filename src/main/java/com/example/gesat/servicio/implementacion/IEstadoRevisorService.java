package com.example.gesat.servicio.implementacion;

import com.example.gesat.controlador.respuesta.ReporteTRespuesta.EstadoRevisorResponse;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.AddEstadoRevisorRequest;
import com.example.gesat.repositorio.IReporteTRepository;
import com.example.gesat.servicio.EstadoRevisorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IEstadoRevisorService implements EstadoRevisorService {
    @Autowired
    private IReporteTRepository repository;

    @Override
    public EstadoRevisorResponse agregarEstadoRevisor(AddEstadoRevisorRequest reporte) {
        return new EstadoRevisorResponse(repository.save(reporte.addEstadoRevisor(repository.getById(reporte.getId()))));    }

}
