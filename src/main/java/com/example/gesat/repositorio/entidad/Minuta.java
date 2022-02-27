package com.example.gesat.repositorio.entidad;

import javax.persistence.*;
@Entity
public class Minuta extends Entidad {
    @Column(nullable = false)
    private String nombreP;
    @Column(nullable = false)
    private String acuerdos;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "encargado_id")
    private Users encargado;
   
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "revisor_id")
    private Users revisor;

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
    public Users getEncargado() {
        return encargado;
    }
    public void setEncargado(Users encargado) {
        this.encargado = encargado;
    }
    public Users getRevisor() {
        return revisor;
    }
    public void setRevisor(Users revisor) {
        this.revisor = revisor;
    }
    

}
