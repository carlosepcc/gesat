package com.example.gesat.controlador;

import java.util.List;

import com.example.gesat.controlador.respuesta.DictamenTResponse;
import com.example.gesat.controlador.solicitud.DictamenTSolicitud.NewDictamenTRequest;
import com.example.gesat.controlador.solicitud.DictamenTSolicitud.UpDictamenTRequest;
import com.example.gesat.servicio.DictamenTService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/dictamen_tecnico")
@CrossOrigin("*")
public class DictamenTController {
   
    @Autowired
    @Qualifier("IDictamenTService")
    private DictamenTService service;

     
    @GetMapping()
    public ResponseEntity<List<DictamenTResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path="/findById")
    public ResponseEntity<DictamenTResponse> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }
    @PostMapping
    public ResponseEntity<DictamenTResponse> save(@RequestBody NewDictamenTRequest usuario) {
        return ResponseEntity.ok(service.save(usuario));
    }
   
    @PutMapping
    public ResponseEntity<DictamenTResponse> edit(@RequestBody UpDictamenTRequest usuario) {
        return ResponseEntity.ok(service.edit(usuario));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
    }

}
