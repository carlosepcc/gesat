package com.example.gesat.controlador.solicitud.ArtefactoSolicitud;

import java.io.IOException;
import com.example.gesat.repositorio.entidad.Artefacto;
import com.fasterxml.jackson.annotation.JsonIgnore;
public class NewArtefactoRequest {
	private String nombre;
	private String fase;
	private String disciplina;  
    private String descripcion;
    

    
    public NewArtefactoRequest() {     
     }
    public String getDescripcion() {return descripcion;}
    public String getNombre() { return nombre; }
    public String getFase() { return fase;}
    public String getDisciplina(){return disciplina;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFase(String fase) {
        this.fase = fase;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @JsonIgnore
	public Artefacto toArtefacto() throws IOException{
        Artefacto artefacto= new Artefacto();
        artefacto.setNombre(this.nombre);
        artefacto.setFase(this.fase);
        artefacto.setDisciplina(this.disciplina);
        artefacto.setDescripcion(this.descripcion);
        return artefacto;
    }

}
