package com.example.gesat.repositorio.entidad;

import java.util.List;

import javax.persistence.*;

@Entity
public class Reporte extends Entidad{
    @Column
    private String namereport;
    
    @OneToMany
    @JoinTable(name = "reporte_reporteTecnico", joinColumns = @JoinColumn(name = "reporteT_id"))
    private List<ReporteT> reportesT;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "reporte_hallazgo", joinColumns = @JoinColumn(name = "hallazgo_id"))
    private List<Hallazgo> hallazgos;

    public Reporte() {
    }

    public String getNamereport() {
        return namereport;
    }

    public void setNamereport(String namereport) {
        this.namereport = namereport;
    }

    public List<ReporteT> getReportesT() {
        return reportesT;
    }

    public void setReportesT(List<ReporteT> reportesT) {
        this.reportesT = reportesT;
    }

    public List<Hallazgo> getHallazgos() {
        return hallazgos;
    }

    public void setHallazgos(List<Hallazgo> hallazgos) {
        this.hallazgos = hallazgos;
    }


    


}
