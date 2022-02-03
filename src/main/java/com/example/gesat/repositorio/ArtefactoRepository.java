package com.example.gesat.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gesat.repositorio.entidad.Artefacto;

@Repository
public interface ArtefactoRepository extends JpaRepository<Artefacto, Integer> {
	

}
