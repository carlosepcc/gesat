package com.example.gesat.servicio;

import java.util.List;

import com.example.gesat.controlador.respuesta.ReporteTRespuesta.EstadoRevisorResponse;
import com.example.gesat.controlador.respuesta.ReporteTRespuesta.ReporteTResponse;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.NewReporteTRequest;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.UpReporteTRequest;
import com.example.gesat.repositorio.entidad.ReporteT;

import org.springframework.stereotype.Service;

@Service
public interface ReporteTService {
    
    List<EstadoRevisorResponse> findAll();
    EstadoRevisorResponse findByID(Integer id);
    ReporteTResponse save(NewReporteTRequest reporteT) throws Exception;
    void delete(Integer[] ids);
    ReporteTResponse edit(UpReporteTRequest reporteT);
    ReporteT getByNombre(String nombre);

}
