package com.example.gesat.controlador;
import java.util.List;

import com.example.gesat.controlador.respuesta.ArtefactoResponse;
import com.example.gesat.controlador.solicitud.NewArtefactoRequest;
import com.example.gesat.servicio.ArtefactoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/artefacto")
@CrossOrigin("*")
public class ArtefactoController {

    @Autowired
    @Qualifier("artefactoServiceImplementation")
    ArtefactoService service;
   
    @GetMapping(path ="/findAll")
    public ResponseEntity<List<ArtefactoResponse>> listar() {
        return ResponseEntity.ok(service.listar());
    }
   
    @GetMapping(path = "/findById")
    public ResponseEntity<ArtefactoResponse> listarPorId(Integer id) {
        return ResponseEntity.ok(service.listarPorID(id));
    }

    @PostMapping
    public ResponseEntity<ArtefactoResponse> save(@RequestBody NewArtefactoRequest artefacto) {
        return ResponseEntity.ok(service.save(artefacto));
    }
    @PutMapping
    public ResponseEntity<ArtefactoResponse> edit(@RequestBody NewArtefactoRequest artefacto) {
        return ResponseEntity.ok(service.edit(artefacto));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
    }
    
}
