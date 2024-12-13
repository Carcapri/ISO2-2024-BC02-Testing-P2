package com.mdx;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PrincipalTest {

    @Test
    void testTipoCuenta_Comfort() {
        Cliente cliente = new Cliente(16, true, false, true);
        Principal.tipoCuenta(cliente);
        assertEquals("Cuenta Comfort", cliente.getTipoCuenta());
    }

    @Test
    void testTipoCuenta_VamosQueTuPuedes() {
        Cliente cliente = new Cliente(20, true, false, false);
        Principal.tipoCuenta(cliente);
        assertEquals("Cuenta Vamos que tú puedes", cliente.getTipoCuenta());
    }

    @Test
    void testTipoCuenta_AhorraAhoraQuePuedes() {
        Cliente cliente = new Cliente(19, false, true, true);
        Principal.tipoCuenta(cliente);
        assertEquals("Cuenta Ahorra ahora que puedes", cliente.getTipoCuenta());
    }

    @Test
    void testTipoCuenta_SaltandoDelNido() {
        Cliente cliente = new Cliente(22, false, true, false);
        Principal.tipoCuenta(cliente);
        assertEquals("Cuenta Saltando del Nido", cliente.getTipoCuenta());
    }

    @Test
    void testTipoCuenta_Independizate() {
        Cliente cliente = new Cliente(30, false, true, true);
        Principal.tipoCuenta(cliente);
        assertEquals("Cuenta Independízate que va siendo hora", cliente.getTipoCuenta());
    }

    @Test
    void testTipoCuenta_BienvenidoALaVidaAdulta() {
        Cliente cliente = new Cliente(30, false, true, false);
        Principal.tipoCuenta(cliente);
        assertEquals("Cuenta Bienvenido a la Vida Adulta", cliente.getTipoCuenta());
    }
        @Test
    void testMain() {
        // Simula la entrada del usuario
        String simulatedInput = "25\ntrue\ntrue\nfalse\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Captura la salida del sistema
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Ejecuta el main
        Principal.main(new String[]{});

        // Verifica la salida
        String output = outputStream.toString();
        assertTrue(output.contains("El tipo de cuenta asignado es: Cuenta Saltando del Nido"));
    }
}