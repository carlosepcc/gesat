package com.example.gesat.servicio.implementacion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.gesat.controlador.respuesta.ReporteResponse;
import com.example.gesat.controlador.solicitud.ReporteSolicitud.NewReporteRequest;
import com.example.gesat.controlador.solicitud.ReporteSolicitud.UpReporteRequest;
import com.example.gesat.repositorio.IReporteRepository;
import com.example.gesat.servicio.ReporteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IReporteService implements ReporteService{
    
    @Autowired
    private IReporteRepository repository;

    @Override
    public List<ReporteResponse> findAll() {
        return repository
                .findAll()
                .parallelStream()
                .map(ReporteResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public ReporteResponse findByID(Integer id) {
        return new ReporteResponse(repository.getById(id));
    }

    @Override
    public ReporteResponse save(NewReporteRequest reporte) {
        return new ReporteResponse(repository.save(reporte.toReporte()));
    }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids)
                .forEach(id -> {
                    repository.deleteById(id);
                });
    }

    @Override
    public ReporteResponse edit(UpReporteRequest reporte) {
        return new ReporteResponse(repository.save(reporte.upReporte()));
    }
    
}
