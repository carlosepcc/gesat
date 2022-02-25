package com.example.gesat.controlador;

import java.util.List;

import com.example.gesat.controlador.respuesta.ReporteResponse;
import com.example.gesat.controlador.solicitud.ReporteSolicitud.NewReporteRequest;
import com.example.gesat.controlador.solicitud.ReporteSolicitud.UpReporteRequest;
import com.example.gesat.servicio.ReporteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reporte")
@CrossOrigin("*")
public class ReporteController {
    @Autowired
    @Qualifier("IReporteService")
    private ReporteService service;

    @GetMapping()
    public ResponseEntity<List<ReporteResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path = "/findById")
    public ResponseEntity<ReporteResponse> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }

    @PostMapping
    public ResponseEntity<ReporteResponse> save(@RequestBody NewReporteRequest reporte) {
        return ResponseEntity.ok(service.save(reporte));
    }

    @PutMapping
    public ResponseEntity<ReporteResponse> edit(@RequestBody UpReporteRequest reporte) {
        return ResponseEntity.ok(service.edit(reporte));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
    }
}
