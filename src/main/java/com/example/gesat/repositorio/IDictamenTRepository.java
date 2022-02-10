package com.example.gesat.repositorio;

import com.example.gesat.repositorio.entidad.DictamenT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDictamenTRepository extends JpaRepository<DictamenT,Integer> {
    
}
