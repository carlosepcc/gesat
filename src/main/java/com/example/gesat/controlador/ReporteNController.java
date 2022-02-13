package com.example.gesat.controlador;

import java.util.List;

import com.example.gesat.controlador.respuesta.ReporteNResponse;
import com.example.gesat.controlador.solicitud.ReporteDeNotificacionSolicitud.NewReporteNRequest;
import com.example.gesat.controlador.solicitud.ReporteDeNotificacionSolicitud.UpReporteNRequest;
import com.example.gesat.servicio.ReporteNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reporteNotificacion")
@CrossOrigin("*")
public class ReporteNController {
    @Autowired
    @Qualifier("IReporteNService")
    private ReporteNService service;

    @GetMapping()
    public ResponseEntity<List<ReporteNResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path="/findById")
    public ResponseEntity<ReporteNResponse> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }

    @PostMapping
    public ResponseEntity<ReporteNResponse> save(@RequestBody NewReporteNRequest reporte) {
        return ResponseEntity.ok(service.save(reporte));
    }

    @PutMapping
    public ResponseEntity<ReporteNResponse> edit(@RequestBody UpReporteNRequest reporte) {
        return ResponseEntity.ok(service.edit(reporte));
    }
    
    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
}

}
