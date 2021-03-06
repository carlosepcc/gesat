package com.example.gesat.controlador;

import com.example.gesat.controlador.respuesta.UsuarioResponse;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.NewUsuarioRequest;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.UpUsuarioRequest;
import com.example.gesat.repositorio.entidad.Users;
import com.example.gesat.servicio.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuario" )
@CrossOrigin("*" )
public class UserController {

    @Autowired
    @Qualifier("IUserService")
    private UserService service;

    @GetMapping()
    public ResponseEntity<List<UsuarioResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }  

    @GetMapping(path = "/findById")
    public ResponseEntity<Users> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }

    @GetMapping(path = "/findByRol")
    public ResponseEntity<List<UsuarioResponse>> findByRol(String rol) {
        return ResponseEntity.ok(service.findByRol(rol));
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> save(@RequestBody NewUsuarioRequest usuario ) throws Exception {
        try{
            return ResponseEntity.ok(service.save(usuario));
           }
           catch (Exception e) {
            throw new Exception("El elemento ya existe",e); 
           }
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
