package com.example.gesat.controlador;
import com.example.gesat.controlador.respuesta.UsuarioResponse;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.NewUsuarioRequest;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.UpUsuarioRequest;
import com.example.gesat.servicio.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UserController {

    @Autowired
    @Qualifier("IUserService")
    private UserService service;

    @GetMapping()
    public ResponseEntity<List<UsuarioResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path = "/findById")
    public ResponseEntity<UsuarioResponse> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }
    @PostMapping
    public ResponseEntity<UsuarioResponse> save(@RequestBody NewUsuarioRequest usuario) {
        return ResponseEntity.ok(service.save(usuario));
    }
   
    @PutMapping
    public ResponseEntity<UsuarioResponse> edit(@RequestBody UpUsuarioRequest usuario) {
        return ResponseEntity.ok(service.edit(usuario));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
    }

}
