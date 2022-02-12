package com.example.gesat.controlador.respuesta;

import com.example.gesat.repositorio.entidad.DictamenT;
import com.example.gesat.repositorio.entidad.User;

public class DictamenTResponse {
    
    private Integer id;
    private String nombreP;
    private User nombreEp;
    private String descripcion;
    private Integer cantNoConf;
    private Integer cantPortMej;
    private String estadoT;
    
    public DictamenTResponse(DictamenT dictamenT) {
        this.id=dictamenT.getId();
        this.nombreEp=dictamenT.getNombreEp();
        this.nombreP=dictamenT.getNombreP();
        this.cantNoConf=dictamenT.getCantNoConf();
        this.cantPortMej=dictamenT.getCantPortMej();
        this.estadoT=dictamenT.getEstadoT();
        this.descripcion=dictamenT.getDescripcion();
    }

    public String getNombreP() {
        return nombreP;
    }
    public User getNombreEp() {
        return nombreEp;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Integer getCantNoConf() {
        return cantNoConf;
    }
    public Integer getCantPortMej() {
        return cantPortMej;
    }
    public String getEstadoT() {
        return estadoT;
    }
    public Integer getId() {
        return id;
    }

}
