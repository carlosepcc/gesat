package com.example.gesat.controlador;

import java.time.LocalDate;
import java.util.List;
import com.example.gesat.controlador.respuesta.HallazgoResponse;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.NewHallazgoRequest;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.UpHallazgoRequest;
import com.example.gesat.servicio.HallazgoTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hallazgo")
@CrossOrigin("*")
public class HallazgoController {

    @Autowired
    @Qualifier("IHallazgoTService")
    private HallazgoTService service;
  
     
    @GetMapping()
    public ResponseEntity<List<HallazgoResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path="/findById")
    public ResponseEntity<HallazgoResponse> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }
    @PostMapping
    public ResponseEntity<HallazgoResponse> save(@RequestBody NewHallazgoRequest usuario) {
        return ResponseEntity.ok(service.save(usuario));
    }
   
    @PutMapping
    public ResponseEntity<HallazgoResponse> edit(@RequestBody UpHallazgoRequest usuario) {
        return ResponseEntity.ok(service.edit(usuario));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
    }
    
    @GetMapping(path="/findByFecha")
    public ResponseEntity<List<HallazgoResponse>> findByFecha(LocalDate fecha)throws Exception {
        return ResponseEntity.ok(service.getByFecha(fecha));
    }
}