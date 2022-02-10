package com.example.gesat.repositorio;

import com.example.gesat.repositorio.entidad.ReporteT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReporteTRepository extends JpaRepository<ReporteT,Integer> {
    
}
