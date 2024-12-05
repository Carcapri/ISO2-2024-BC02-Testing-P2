package com.mdx;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad del cliente: ");
        int edad = scanner.nextInt();

        System.out.print("¿El cliente es estudiante? (true/false): ");
        boolean estudiante = scanner.nextBoolean();

        System.out.print("¿El cliente es trabajador? (true/false): ");
        boolean trabajador = scanner.nextBoolean();

        System.out.print("¿El cliente vive con sus padres? (true/false): ");
        boolean viveConPadres = scanner.nextBoolean();

        Cliente cliente = new Cliente(edad, estudiante, trabajador, viveConPadres);

        tipoCuenta(cliente);

        System.out.println("El tipo de cuenta asignado es: " + cliente.getTipoCuenta());

        scanner.close();
    }

    static void tipoCuenta(Cliente cliente) {
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
