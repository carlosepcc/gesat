package com.example.gesat.controlador.respuesta;
import java.time.LocalDate;

import com.example.gesat.repositorio.entidad.ReporteN;

public class ReporteNResponse {
    private Integer id;
    private String producto;
    private String nombre;
    private String fase;
    private String disciplina;
    private Integer local;
    private LocalDate fecha;
    private String hora;
    private String descripcion;

    public ReporteNResponse(ReporteN reporte) {
        this.id=reporte.getId();
        this.producto=reporte.getProducto();
        this.nombre=reporte.getNombre();
        this.fase=reporte.getFase();
        this.disciplina=reporte.getDisciplina();
        this.local=reporte.getLocal();
        this.fecha=reporte.getFecha();
        this.hora=reporte.getHora();
        this.descripcion=reporte.getDescripcion();
    }

    public Integer getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFase() {
        return fase;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Integer getLocal() {
        return local;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
