package com.DIHL.x00167518;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(/* No se como poner el parametro, aiuda */){

    }

    public void quitEmpleado(String nombreEmplado){

    }
}
