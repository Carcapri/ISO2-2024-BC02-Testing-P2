package com.mdx;

public class Cliente {
    private int edad;
    private boolean estudiante;
    private boolean trabajador;
    private boolean viveConPadres;
    private String tipoCuenta;

    public Cliente(int edad, boolean estudiante, boolean trabajador, boolean viveConPadres) {
        this.edad = edad;
        this.estudiante = estudiante;
        this.trabajador = trabajador;
        this.viveConPadres = viveConPadres;
        this.tipoCuenta = "";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esEstudiante() {
        return estudiante;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }

    public boolean esTrabajador() {
        return trabajador;
    }

    public void setTrabajador(boolean trabajador) {
        this.trabajador = trabajador;
    }

    public boolean esViveConPadres() {
        return viveConPadres;
    }

    public void setViveConPadres(boolean viveConPadres) {
        this.viveConPadres = viveConPadres;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}