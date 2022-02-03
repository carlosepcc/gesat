package com.example.gesat.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gesat.repositorio.entidad.Artefacto;

public interface ArtefactoRepository extends JpaRepository<Artefacto, Integer> {
	

}
