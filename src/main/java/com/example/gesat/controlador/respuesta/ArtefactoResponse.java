package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.Artefacto;

public class ArtefactoResponse {
	private Integer id;
    private String nombre;
    private String fase;
    private String disciplina;
	private String descripcion;


	public ArtefactoResponse(Artefacto artefacto) {
		this.id = artefacto.getId();
		this.nombre = artefacto.getNombre();
		this.fase = artefacto.getFase();
		this.disciplina = artefacto.getDisciplina();
		this.descripcion=artefacto.getDescripcion();
	
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Integer getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getFase() {
		return fase;
	}
	public String getDisciplina() {
		return disciplina;
	}

}
