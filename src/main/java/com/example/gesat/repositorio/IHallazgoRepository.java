package com.example.gesat.repositorio;

import com.example.gesat.repositorio.entidad.Hallazgo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHallazgoRepository extends JpaRepository<Hallazgo,Integer> {
    
}
