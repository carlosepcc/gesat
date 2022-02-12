package com.example.gesat.controlador.solicitud.DictamenTSolicitud;

import com.example.gesat.repositorio.entidad.DictamenT;
import com.example.gesat.repositorio.entidad.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class NewDictamenTRequest {
    private String nombreP;
    private User nombreEp;
    private String descripcion;
    private Integer cantNoConf;
    private Integer cantPortMej;
    private String estadoT;
    
    public NewDictamenTRequest() {
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
    @JsonIgnore
	public DictamenT toDictamenT(){
        DictamenT dictamenT= new DictamenT();
        dictamenT.setNombreP(this.nombreP);
        dictamenT.setNombreEp(this.nombreEp);
        dictamenT.setDescripcion(this.descripcion);
        dictamenT.setCantNoConf(this.cantNoConf);
        dictamenT.setCantPortMej(this.cantPortMej);
        dictamenT.setEstadoT(this.estadoT);
        return dictamenT;
    }

}
