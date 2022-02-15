package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.Minuta;
import com.example.gesat.repositorio.entidad.Users;

public class MinutaResponse {
    private Integer id;
    private String nombreP;
    private String acuerdos;
    private Users encargado;
    private Users revisor;
    
    public MinutaResponse(Minuta minuta) {
        this.id = minuta.getId();
        this.nombreP=minuta.getNombreP();
        this.acuerdos= minuta.getAcuerdos();
        this.encargado= minuta.getEncargado();
        this.revisor= minuta.getRevisor();
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
}

