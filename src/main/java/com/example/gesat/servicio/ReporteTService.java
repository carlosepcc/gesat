package com.example.gesat.servicio;

import java.util.List;

import com.example.gesat.controlador.respuesta.ReporteTRespuesta.EstadoRevisorResponse;
import com.example.gesat.controlador.respuesta.ReporteTRespuesta.ReporteTResponse;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.NewReporteTRequest;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.UpReporteTRequest;

import org.springframework.stereotype.Service;

@Service
public interface ReporteTService {
    
    List<EstadoRevisorResponse> findAll();
    EstadoRevisorResponse findByID(Integer id);
    ReporteTResponse save(NewReporteTRequest reporteT);
    void delete(Integer[] ids);
    ReporteTResponse edit(UpReporteTRequest reporteT);

}
