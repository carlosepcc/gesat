package com.example.gesat.repositorio.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Artefacto extends Entidad {

	@Column
	private String nombre;
	@Column
	private Integer fase;
	@Column
	private Integer disciplina;
	@Column
	private String descripcion;
	@Lob
	@Column
	private byte[] file;

	public Artefacto() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getFase() {
		return fase;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFase(Integer fase) {
		this.fase = fase;
	}

	public Integer getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Integer disciplina) {
		this.disciplina = disciplina;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

}