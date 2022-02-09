package com.example.gesat.controlador.solicitud.ArtefactoSolicitud;

import com.example.gesat.repositorio.entidad.Artefacto;
import com.fasterxml.jackson.annotation.JsonIgnore;
public class NewArtefactoRequest {
	private String nombre;
	private Integer fase;
	private Integer disciplina;  
    private String descripcion;
    
    public NewArtefactoRequest() {     
     }
     
    public String getDescripcion() {return descripcion;}
    public String getNombre() { return nombre; }
    public Integer getFase() { return fase;}
    public Integer getDisciplina(){return disciplina;}
    
    
    @JsonIgnore
	public Artefacto toArtefacto(){
        Artefacto artefacto= new Artefacto();
        artefacto.setNombre(this.nombre);
        artefacto.setFase(this.fase);
        artefacto.setDisciplina(this.disciplina);
        return artefacto;
    }

}
