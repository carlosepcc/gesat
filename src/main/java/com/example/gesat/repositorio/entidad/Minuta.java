package com.example.gesat.repositorio.entidad;

import javax.persistence.*;
@Entity
public class Minuta extends Entidad {
    @Column
    private String nombreP;
    @Column
    private String acuerdos;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "encargado_id")
    private User encargado;
   
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "revisor_id")
    private User revisor;

    public Minuta() {
    }
    public String getNombreP() {
        return nombreP;
    }
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    public String getAcuerdos() {
        return acuerdos;
    }
    public void setAcuerdos(String acuerdos) {
        this.acuerdos = acuerdos;
    }
    public User getEncargado() {
        return encargado;
    }
    public void setEncargado(User encargado) {
        this.encargado = encargado;
    }
    public User getRevisor() {
        return revisor;
    }
    public void setRevisor(User revisor) {
        this.revisor = revisor;
    }
    

}
