package com.example.gesat.servicio;
import java.util.List;
import com.example.gesat.controlador.respuesta.HallazgoResponse;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.NewHallazgoRequest;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.UpHallazgoRequest;

import org.springframework.stereotype.Service;

@Service
public interface HallazgoTService  {
    List<HallazgoResponse> findAll();
    HallazgoResponse findByID(Integer id);
    HallazgoResponse save(NewHallazgoRequest artefacto);
    void delete(Integer[] ids);
    HallazgoResponse edit(UpHallazgoRequest artefacto);

}
