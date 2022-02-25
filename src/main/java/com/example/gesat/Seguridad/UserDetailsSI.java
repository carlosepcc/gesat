package com.example.gesat.Seguridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

import com.example.gesat.repositorio.entidad.Users;
import com.example.gesat.servicio.UserService;

@Service
public class UserDetailsSI implements UserDetailsService {
    @Autowired
    private UserService repository;

    @Override
    public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
        Users usuario = repository.getByUsuario(arg0);
        return new User(usuario.getUsername(), usuario.getPass(), usuario.getRoles()
                .parallelStream().map(rol -> new SimpleGrantedAuthority(rol.name()))
                .collect(Collectors.toList()));
    }

}
