package com.example.gesat.repositorio;
import com.example.gesat.repositorio.entidad.Reporte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReporteRepository extends JpaRepository<Reporte,Integer> {

}
