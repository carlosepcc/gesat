package com.example.gesat.controlador.solicitud.MinutaSolicitud;

import com.example.gesat.repositorio.entidad.Minuta;
import com.example.gesat.repositorio.entidad.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UpMinutaRequest {
    
    private Integer id;
    private String nombreP;
    private String acuerdos;
    private User encargado;
    private User revisor;
    
    public UpMinutaRequest() {
    }

    public Integer getId() {
        return id;
    }
    public String getNombreP() {
        return nombreP;
    }
    public String getAcuerdos() {
        return acuerdos;
    } 
    public User getEncargado() {
        return encargado;
    }
    public User getRevisor() {
        return revisor;
    }    
      
    @JsonIgnore
	public Minuta upMinuta(){
        Minuta minuta= new Minuta();
        minuta.setId(this.id);
        minuta.setNombreP(this.nombreP);
        minuta.setAcuerdos(this.acuerdos);
        minuta.setEncargado(this.encargado);
        minuta.setRevisor(this.revisor);
        return minuta;
    }

}
