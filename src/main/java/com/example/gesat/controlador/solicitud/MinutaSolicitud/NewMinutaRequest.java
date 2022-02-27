package com.example.gesat.controlador.solicitud.MinutaSolicitud;

import com.example.gesat.repositorio.entidad.Minuta;
import com.example.gesat.repositorio.entidad.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewMinutaRequest {
    private String nombreP;
    private String acuerdos;
    private Users encargado;
    private Users revisor;
    
    public NewMinutaRequest() {
    }
    public String getNombreP() {
        return nombreP;
    }
    public String getAcuerdos() {
        return acuerdos;
    } 
    public Users getEncargado() {
        return encargado;
    }
    public Users getRevisor() {
        return revisor;
    }    
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    public void setAcuerdos(String acuerdos) {
        this.acuerdos = acuerdos;
    }
    public void setEncargado(Users encargado) {
        this.encargado = encargado;
    }
    public void setRevisor(Users revisor) {
        this.revisor = revisor;
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
