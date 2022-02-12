package com.example.gesat.servicio.implementacion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.gesat.controlador.respuesta.ReporteTRespuesta.EstadoRevisorResponse;
import com.example.gesat.controlador.respuesta.ReporteTRespuesta.ReporteTResponse;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.NewReporteTRequest;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.UpReporteTRequest;
import com.example.gesat.repositorio.IReporteTRepository;
import com.example.gesat.servicio.ReporteTService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IReporteTService implements ReporteTService{

    @Autowired
    private IReporteTRepository repository;

    @Override
    public List<EstadoRevisorResponse> findAll() {
        return repository
                .findAll()
                .parallelStream()
                .map(EstadoRevisorResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public ReporteTResponse save(NewReporteTRequest reporte) {
        return new ReporteTResponse(repository.save(reporte.toReporteT()));
    }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids)
                .forEach(id -> {
                    repository.deleteById(id);
                });
    }

    @Override
    public EstadoRevisorResponse findByID(Integer id) {
        return new EstadoRevisorResponse(repository.getById(id));
    }

    @Override
    public ReporteTResponse edit(UpReporteTRequest reporte) {
      return new ReporteTResponse(repository.save(reporte.upReporteT()));
    }
    
}
