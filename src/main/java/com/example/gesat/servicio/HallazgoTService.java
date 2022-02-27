package com.example.gesat.servicio;
import java.time.LocalDate;
import java.util.List;
import com.example.gesat.controlador.respuesta.HallazgoResponse;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.NewHallazgoRequest;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.UpHallazgoRequest;


import org.springframework.stereotype.Service;

@Service
public interface HallazgoTService  {
    List<HallazgoResponse> findAll();
    HallazgoResponse findByID(Integer id);
    HallazgoResponse save(NewHallazgoRequest hallazgo);
    void delete(Integer[] ids);
    HallazgoResponse edit(UpHallazgoRequest hallazgo);
    List<HallazgoResponse> getByFecha(LocalDate fecha);
}
