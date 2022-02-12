package com.example.gesat.controlador;
import java.util.List;

import com.example.gesat.controlador.respuesta.MinutaResponse;
import com.example.gesat.controlador.solicitud.MinutaSolicitud.NewMinutaRequest;
import com.example.gesat.controlador.solicitud.MinutaSolicitud.UpMinutaRequest;
import com.example.gesat.servicio.MinutaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/minuta")
@CrossOrigin("*")
public class MinutaController {
    @Autowired
    @Qualifier("IMinutaService")
    private MinutaService service;

    
    @GetMapping()
    public ResponseEntity<List<MinutaResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
   
    @GetMapping(path = "/findById")
    public ResponseEntity<MinutaResponse> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }

    @PostMapping
    public ResponseEntity<MinutaResponse> save(@RequestBody NewMinutaRequest usuario) {
        return ResponseEntity.ok(service.save(usuario));
    }
   
    @PutMapping
    public ResponseEntity<MinutaResponse> edit(@RequestBody UpMinutaRequest usuario) {
        return ResponseEntity.ok(service.edit(usuario));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
    }
    
}
