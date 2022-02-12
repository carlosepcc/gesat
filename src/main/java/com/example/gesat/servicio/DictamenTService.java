package com.example.gesat.servicio;

import java.util.List;

import com.example.gesat.controlador.respuesta.DictamenTResponse;
import com.example.gesat.controlador.solicitud.DictamenTSolicitud.NewDictamenTRequest;
import com.example.gesat.controlador.solicitud.DictamenTSolicitud.UpDictamenTRequest;

import org.springframework.stereotype.Service;

@Service
public interface DictamenTService {
    List<DictamenTResponse> findAll();
    DictamenTResponse findByID(Integer id);
    DictamenTResponse save(NewDictamenTRequest artefacto);
    void delete(Integer[] ids);
    DictamenTResponse edit(UpDictamenTRequest artefacto);
}
