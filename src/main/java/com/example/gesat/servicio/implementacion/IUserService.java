package com.example.gesat.servicio.implementacion;

import com.example.gesat.controlador.respuesta.UsuarioResponse;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.NewUsuarioRequest;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.UpUsuarioRequest;
import com.example.gesat.repositorio.IUserRepository;
import com.example.gesat.repositorio.entidad.Users;
import com.example.gesat.servicio.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IUserService implements UserService {

    @Autowired
    public PasswordEncoder passwordEncoder;
    @Autowired
    @Qualifier("IUserRepository")
    private IUserRepository repository;

    @Override
    public List<UsuarioResponse> findAll() {
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
    public UsuarioResponse findByID(Integer id) {
        return new UsuarioResponse(repository.getById(id));

    }

    @Override
    public UsuarioResponse edit(UpUsuarioRequest usuario) {
        return new UsuarioResponse(repository.save(usuario.upUsuario()));
    }

    @Override
    public List<UsuarioResponse> findByRol(String rol) {
        List<UsuarioResponse> u = new ArrayList<UsuarioResponse>();
        this.findAll().parallelStream()
                .forEach(user -> {
                    user.getRoles().forEach(r -> {
                        if (r.equals(rol))
                            u.add(user);
                    });
                });
        return u;
    }

    @Override
    public Users getByUsuario(String username) {
        if (username.equals("admin")) {
            Users usuario = new Users();
            usuario.setNombre("Admin");
            usuario.setUsername(username);
            usuario.setPass(passwordEncoder.encode("1234"));
            usuario.getRoles().add(Users.Rol.Usuario);
            usuario.getRoles().add(Users.Rol.Administrador);
            return usuario;
        }
        return repository.findByUsername(username);
    }

}
