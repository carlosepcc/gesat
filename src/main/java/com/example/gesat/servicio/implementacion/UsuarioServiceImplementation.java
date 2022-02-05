package com.example.gesat.servicio.implementacion;

import com.example.gesat.controlador.respuesta.UsuarioResponse;
import com.example.gesat.controlador.solicitud.NewUsuarioRequest;
import com.example.gesat.repositorio.UsuarioRepository;
import com.example.gesat.repositorio.entidad.Usuario;
import com.example.gesat.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImplementation implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<UsuarioResponse> listar() {
        return repository
                .findAll()
                .parallelStream()
                .map(UsuarioResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioResponse save(NewUsuarioRequest usuario) {
        return new UsuarioResponse(repository.save(usuario.toUsuario()));
    }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids).forEach(id -> {
            repository.deleteById(id);
        });
    }

    @Override
    public UsuarioResponse edit(NewUsuarioRequest usuario) {
        Usuario u = usuario.toUsuario();
        Usuario w = repository.getById(u.getId());
        w.setRoles(u.getRoles());
        w.setUsername(u.getUsername());
        return new UsuarioResponse (w);
    }
}
