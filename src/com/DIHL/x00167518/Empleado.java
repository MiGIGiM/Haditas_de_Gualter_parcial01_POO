package com.DIHL.x00167518;

import java.util.ArrayList;

public abstract class Empleado {
    protected String nombre;
    protected String puesto;
    protected ArrayList<Documento> documentos;
    protected double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // No estoy segura si aqui se recibe la lista o nel
    // creo que nel, creo que recibis el objeto de tipo documento

    public void addDocumento(ArrayList<Documento> documentos){

    }

    public void removeDocumento(String Documento){

    }
}
