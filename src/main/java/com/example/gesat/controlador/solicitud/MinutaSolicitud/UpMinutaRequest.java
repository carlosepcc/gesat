package com.example.gesat.controlador.solicitud.MinutaSolicitud;

import com.example.gesat.repositorio.entidad.Minuta;
import com.example.gesat.repositorio.entidad.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UpMinutaRequest {
    
    private Integer id;
    private String nombreP;
    private String acuerdos;
    private Users encargado;
    private Users revisor;
    
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
    public Users getEncargado() {
        return encargado;
    }
    public Users getRevisor() {
        return revisor;
    }    
    public void setId(Integer id) {
        this.id = id;
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
