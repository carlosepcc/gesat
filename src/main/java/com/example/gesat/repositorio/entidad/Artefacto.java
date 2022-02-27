package com.example.gesat.repositorio.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Artefacto extends Entidad {

	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String fase;
	@Column(nullable = false)
	private String disciplina;
	@Column(nullable = false)
	private String descripcion;
	

	public Artefacto() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFase() {
		return fase;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


}