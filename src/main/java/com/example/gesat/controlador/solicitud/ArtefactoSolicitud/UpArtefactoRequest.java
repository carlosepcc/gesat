
package com.example.gesat.controlador.solicitud.ArtefactoSolicitud;
import com.example.gesat.repositorio.entidad.Artefacto;
import com.fasterxml.jackson.annotation.JsonIgnore;
public class UpArtefactoRequest {
    private Integer id;
	private String nombre;
	private String fase;
	private String disciplina;  
    private String descripcion;

    
    public UpArtefactoRequest() {     
     }
    public Integer getId(){return id;}
    public String getDescripcion() {return descripcion;}
    public String getNombre() { return nombre; }
    public String getFase() { return fase;}
    public String getDisciplina(){return disciplina;}
       
    public void setId(Integer id) {
        this.id = id;
    }
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
	public Artefacto upArtefacto() {
        Artefacto artefacto= new Artefacto();
        artefacto.setId(this.id);
        artefacto.setNombre(this.nombre);
        artefacto.setFase(this.fase);
        artefacto.setDisciplina(this.disciplina);
        artefacto.setDescripcion(this.descripcion);
        return artefacto;
    }

}
