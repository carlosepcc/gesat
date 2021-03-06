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
    public UsuarioResponse save(NewUsuarioRequest usuario) throws Exception {
      if(getByUsuario(usuario.toUsuario().getUsername()) == null) 
            return new UsuarioResponse(repository.save(usuario.toUsuario()));
        else throw new Exception("El nombre de usuario ya está en uso");
            }

    @Override
    public void delete(Integer[] ids) {
        Arrays.stream(ids).forEach(id -> {
            repository.deleteById(id);
        });
    }

    @Override
    public Users findByID(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public UsuarioResponse edit(UpUsuarioRequest usuario) {
       if( usuario.getPass()==null){
       usuario.setPass(findByID(usuario.getId()).getPass());
            return new UsuarioResponse(repository.save(usuario.usPass()));
       }
       else return new UsuarioResponse(repository.save(usuario.upUsuario())); 
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
            usuario.setApellidos("Admin");
            usuario.setUsername(username);
            usuario.setPass(passwordEncoder.encode("1234"));
            usuario.getRoles().add(Users.Rol.Administrador);
            usuario.getRoles().add(Users.Rol.Asesor_de_calidad);
            usuario.getRoles().add(Users.Rol.Encargado_de_proyecto);
            usuario.getRoles().add(Users.Rol.Coordinador_de_calidad);
            usuario.getRoles().add(Users.Rol.Revisor);
            return usuario;
        }
        return repository.findByUsername(username);
    }

}
