package com.example.gesat.controlador.solicitud.ArtefactoSolicitud;

import java.io.IOException;
import com.example.gesat.repositorio.entidad.Artefacto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;
public class NewArtefactoRequest {
	private String nombre;
	private Integer fase;
	private Integer disciplina;  
    private String descripcion;
    private MultipartFile file;

    
    public NewArtefactoRequest() {     
     }
     
    public String getDescripcion() {return descripcion;}
    public String getNombre() { return nombre; }
    public Integer getFase() { return fase;}
    public Integer getDisciplina(){return disciplina;}
    public MultipartFile getFile() {return file;}

    @JsonIgnore
	public Artefacto toArtefacto() throws IOException{
        Artefacto artefacto= new Artefacto();
        artefacto.setNombre(this.nombre);
        artefacto.setFase(this.fase);
        artefacto.setDisciplina(this.disciplina);
        artefacto.setDescripcion(this.descripcion);
        artefacto.setFile(file.getBytes());
        return artefacto;
    }

}
