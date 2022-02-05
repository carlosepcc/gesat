package com.example.gesat.repositorio.entidad;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Artefacto extends Entidad {

	@Column
	private String nombre;

	@Column(name = "fase")
	private Integer fase;
	
	@Column(name = "disciplina")
	private Integer disciplina;
	
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

	public void setFase(Integer fase) {
		this.fase = fase;
	}

	public Integer getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Integer disciplina) {
		this.disciplina = disciplina;
	}
	
}