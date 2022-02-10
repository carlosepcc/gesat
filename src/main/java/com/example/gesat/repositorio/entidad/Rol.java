package com.example.gesat.repositorio.entidad;


public enum Rol{
    Administrador, Coordinador_de_calidad, Asesor_de_calidad, Encargado_de_proyecto, Revisor, Usuario;

    
    private String rolname;

    private Rol() {
    }

    private Rol(String rolname) {
        this.rolname = rolname;
    }


    public String getRolname() {
        return rolname;
    }

    public void setRolname(String rolname) {
        this.rolname = rolname;
    }
}