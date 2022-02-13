package com.example.gesat.controlador.respuesta;
import java.time.LocalDate;
import com.example.gesat.repositorio.entidad.Hallazgo;

public class HallazgoResponse {
    private Integer id;
    private String productoAf;
    private String ubicacion;
    private String descripcion;
    private Integer tipo;
    private LocalDate fecha;
    private String impacto;
    
    public HallazgoResponse(Hallazgo hallazgo) {
        this.id=hallazgo.getId();
        this.productoAf=hallazgo.getProductoAf();
        this.ubicacion=hallazgo.getUbicacion();
        this.descripcion=hallazgo.getDescripcion();
        this.tipo=hallazgo.getTipo();
        this.fecha=hallazgo.getFecha();
        this.impacto=hallazgo.getImpacto();
    }

    public String getProductoAf() {
        return productoAf;
    }

    public String getUbicacion() {
        return ubicacion;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public Integer getTipo() {
        return tipo;
    }
    public Integer getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getImpacto() {
        return impacto;
    }
  
}
