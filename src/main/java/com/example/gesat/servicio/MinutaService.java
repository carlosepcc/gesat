package com.example.gesat.servicio;

import java.util.List;

import com.example.gesat.controlador.respuesta.MinutaResponse;
import com.example.gesat.controlador.solicitud.MinutaSolicitud.NewMinutaRequest;
import com.example.gesat.controlador.solicitud.MinutaSolicitud.UpMinutaRequest;

import org.springframework.stereotype.Service;

@Service
public interface MinutaService {

    List<MinutaResponse> findAll();
    MinutaResponse findByID(Integer id);
    MinutaResponse save(NewMinutaRequest minuta);
    void delete(Integer[] ids);
    MinutaResponse edit(UpMinutaRequest minuta);

}
