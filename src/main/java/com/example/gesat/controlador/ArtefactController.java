package com.example.gesat.controlador;

import java.io.IOException;
import java.util.List;

import com.example.gesat.controlador.respuesta.ArtefactoResponse;
import com.example.gesat.controlador.solicitud.ArtefactoSolicitud.NewArtefactoRequest;
import com.example.gesat.controlador.solicitud.ArtefactoSolicitud.UpArtefactoRequest;
import com.example.gesat.servicio.ArtefactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artefacto")
@CrossOrigin("*")
public class ArtefactController {

    @Autowired
    @Qualifier("IArtefactService")
    private ArtefactService service;

    @GetMapping()
    public ResponseEntity<List<ArtefactoResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path = "/findById")
    public ResponseEntity<ArtefactoResponse> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }

    @PostMapping
    public ResponseEntity<ArtefactoResponse> save(@RequestBody NewArtefactoRequest artefacto) throws Exception {
        try {
            return ResponseEntity.ok(service.save(artefacto));
        } 
        catch (Exception e) {
            throw new Exception("El elemento ya existe", e);
        }
    }

    @PutMapping
    public ResponseEntity<ArtefactoResponse> edit(@RequestBody UpArtefactoRequest artefacto) throws IOException {
        return ResponseEntity.ok(service.edit(artefacto));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
    }

}
