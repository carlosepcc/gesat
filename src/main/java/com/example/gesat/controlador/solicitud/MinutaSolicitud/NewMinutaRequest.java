package com.example.gesat.controlador.solicitud.MinutaSolicitud;

import com.example.gesat.repositorio.entidad.Minuta;
import com.example.gesat.repositorio.entidad.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewMinutaRequest {
    private String nombreP;
    private String acuerdos;
    private User encargado;
    private User revisor;
    
    public NewMinutaRequest() {
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
	public Minuta toMinuta(){
        Minuta minuta= new Minuta();
        minuta.setNombreP(this.nombreP);
        minuta.setAcuerdos(this.acuerdos);
        minuta.setEncargado(this.encargado);
        minuta.setRevisor(this.revisor);
       
        return minuta;
    }

}
