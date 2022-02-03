package com.example.gesat.repositorio.entidad;
import javax.persistence.Column;
public class Artefacto extends Entidad {

	@Column
	private String nombre;

	@Column(name = "fase")
	private Integer fase;
	
	@Column(name = "disciplina")
	private Integer disciplina;
	
	public Artefacto() {
		
	}

	public String getnombre() {
		return nombre;
	}

	public void setArtefactonombre(String artefactonombre) {
		this.nombre = artefactonombre;
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