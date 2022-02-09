
package com.example.gesat.controlador.solicitud.ArtefactoSolicitud;

import com.example.gesat.repositorio.entidad.Artefacto;
import com.fasterxml.jackson.annotation.JsonIgnore;
public class UpArtefactoRequest {
    private Integer id;
	private String nombre;
	private Integer fase;
	private Integer disciplina;  
    private String descripcion;
    
    public UpArtefactoRequest() {     
     }
    public Integer getId(){return id;}
    public String getDescripcion() {return descripcion;}
    public String getNombre() { return nombre; }
    public Integer getFase() { return fase;}
    public Integer getDisciplina(){return disciplina;}
    
    
    @JsonIgnore
	public Artefacto upArtefacto(){
        Artefacto artefacto= new Artefacto();
        artefacto.setId(this.id);
        artefacto.setNombre(this.nombre);
        artefacto.setFase(this.fase);
        artefacto.setDisciplina(this.disciplina);
        return artefacto;
    }

}
