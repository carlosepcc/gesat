package com.example.gesat.servicio.implementacion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.gesat.controlador.respuesta.ReporteNResponse;
import com.example.gesat.controlador.solicitud.ReporteDeNotificacionSolicitud.NewReporteNRequest;
import com.example.gesat.controlador.solicitud.ReporteDeNotificacionSolicitud.UpReporteNRequest;
import com.example.gesat.repositorio.IReporteNRepository;
import com.example.gesat.servicio.ReporteNService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IReporteNService implements ReporteNService{

   
    @Autowired
    private IReporteNRepository repository;

    @Override
    public List<ReporteNResponse> findAll() {
        return repository
                .findAll()
                .parallelStream()
                .map(ReporteNResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public ReporteNResponse findByID(Integer id) {
        return new ReporteNResponse(repository.getById(id));
    }

    @Override
    public ReporteNResponse save(NewReporteNRequest reporte) {
        return new ReporteNResponse(repository.save(reporte.toReporteN()));
    }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids)
                .forEach(id -> {
                    repository.deleteById(id);
                });
    }

    @Override
    public ReporteNResponse edit(UpReporteNRequest reporte) {
        return new ReporteNResponse(repository.save(reporte.upReporteN()));
    }
    
}
