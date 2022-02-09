package com.example.gesat.controlador;
import java.util.List;
import com.example.gesat.controlador.respuesta.HallazgoResponse;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.NewHallazgoRequest;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.UpHallazgoRequest;
import com.example.gesat.servicio.HallazgoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hallazgo")
@CrossOrigin("*")
public class HallazgoController {

    @Autowired
    @Qualifier("hallazgoServiceImplementation")
    private HallazgoService service;
     
    @GetMapping()
    public ResponseEntity<List<HallazgoResponse>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping(path="/findById")
    public ResponseEntity<HallazgoResponse> listarPorId(Integer id) {
        return ResponseEntity.ok(service.listarPorID(id));
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
    
}