package com.example.gesat.repositorio;

import com.example.gesat.repositorio.entidad.ReporteN;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IReporteNRepository extends JpaRepository<ReporteN,Integer> {
    
}
