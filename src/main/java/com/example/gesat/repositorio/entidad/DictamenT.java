package com.example.gesat.repositorio.entidad;

import javax.persistence.*;

@Entity
public class DictamenT extends Entidad {
    @Column
    private String nombre;
    @Column
    private String nombreP;
    @Column
    private String nombreEp;
    @Column
    private String descripcion;
    @Column
    private Integer cantNoConf;
    @Column
    private Integer cantPortMej;
    @Column
    private String estadoT;
    
    public DictamenT() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreEp() {
        return nombreEp;
    }

    public void setNombreEp(String nombreEp) {
        this.nombreEp = nombreEp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantNoConf() {
        return cantNoConf;
    }

    public void setCantNoConf(Integer cantNoConf) {
        this.cantNoConf = cantNoConf;
    }

    public Integer getCantPortMej() {
        return cantPortMej;
    }

    public void setCantPortMej(Integer cantPortMej) {
        this.cantPortMej = cantPortMej;
    }

    public String getEstadoT() {
        return estadoT;
    }

    public void setEstadoT(String estadoT) {
        this.estadoT = estadoT;
    }

    

}
