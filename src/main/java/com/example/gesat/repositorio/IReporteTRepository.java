package com.example.gesat.repositorio;
import java.time.LocalDate;
import java.util.List;

import com.example.gesat.repositorio.entidad.ReporteT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReporteTRepository extends JpaRepository<ReporteT,Integer> {
     List<ReporteT> findAllByFechaI(LocalDate fechaI);
}
