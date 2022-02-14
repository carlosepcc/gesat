package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.Artefacto;

public class ArtefactoResponse {
	private Integer id;
    private String nombre;
    private Integer fase;
    private Integer disciplina;
	private String descripcion;
	private byte[] file;

	public ArtefactoResponse(Artefacto artefacto) {
		this.id = artefacto.getId();
		this.nombre = artefacto.getNombre();
		this.fase = artefacto.getFase();
		this.disciplina = artefacto.getDisciplina();
		this.descripcion=artefacto.getDescripcion();
		this.file=artefacto.getFile();
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
	public Integer getFase() {
		return fase;
	}
	public Integer getDisciplina() {
		return disciplina;
	}
	public byte[] getFile() {
		return file;
	}

}
