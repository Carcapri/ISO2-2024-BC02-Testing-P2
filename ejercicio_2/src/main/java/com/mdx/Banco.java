package com.mdx;

public class Banco {

    public void tipoCuenta(Cliente cliente) {
        if (cliente.getEdad() < 18 && cliente.esEstudiante() && cliente.esViveConPadres()) {
            cliente.setTipoCuenta("Cuenta Comfort");
        }
        if (cliente.getEdad() < 25 && cliente.esEstudiante() && !cliente.esViveConPadres()) {
            cliente.setTipoCuenta("Cuenta Vamos que tú puedes");
        }
        if (cliente.getEdad() >= 18 && cliente.esTrabajador() && cliente.esViveConPadres()) {
            cliente.setTipoCuenta("Cuenta Ahorra ahora que puedes");
        } else if (cliente.getEdad() >= 18 && cliente.esTrabajador() && !cliente.esViveConPadres()) {
            cliente.setTipoCuenta("Cuenta Saltando del Nido");
        }
        if (cliente.getEdad() > 25 && cliente.esTrabajador() && cliente.esViveConPadres()) {
            cliente.setTipoCuenta("Cuenta Independízate que va siendo hora");
        }
        if (cliente.getEdad() > 25 && cliente.esTrabajador() && !cliente.esViveConPadres()) {
            cliente.setTipoCuenta("Cuenta Bienvenido a la Vida Adulta");
           }
    }
}