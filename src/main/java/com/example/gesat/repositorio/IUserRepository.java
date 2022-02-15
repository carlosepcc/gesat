package com.example.gesat.repositorio;
import com.example.gesat.repositorio.entidad.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
