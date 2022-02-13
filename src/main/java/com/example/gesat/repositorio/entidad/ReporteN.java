package com.example.gesat.repositorio.entidad;
import java.time.LocalDate;
import javax.persistence.*;
@Table(name = "reporte_Notificacion")
@Entity
public class ReporteN extends Entidad{
    
    @Column
    private String producto;
    @Column
    private String nombre;
    @Column
    private String fase;
    @Column
    private String disciplina;
    @Column
    private Integer local;
    @Column
    private LocalDate fecha;
    @Column
    private String hora;
    @Column
    private String descripcion;
    
    public ReporteN() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Integer getLocal() {
        return local;
    }

    public void setLocal(Integer local) {
        this.local = local;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(Integer hh, Integer mm){
       this.hora= hh +":"+ mm;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 

    
}
