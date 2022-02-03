package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.Artefacto;

public class ArtefactoResponse {
	private Integer id;

    private String nombre;

    private Integer fase;
    private Integer disciplina;

	public ArtefactoResponse(Artefacto artefacto) {
		this.id = artefacto.getId();
		this.nombre = artefacto.getnombre();
		this.fase = artefacto.getFase();
		this.disciplina = artefacto.getDisciplina();
	}
	
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getnombre() {
		return this.nombre;
	}
	public void setArtefactoname(String nombre) {
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
