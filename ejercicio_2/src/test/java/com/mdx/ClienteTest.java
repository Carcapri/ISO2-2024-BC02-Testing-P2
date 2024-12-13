package com.mdx;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testClienteInitialization() {
        Cliente cliente = new Cliente(25, true, false, true);
        assertEquals(25, cliente.getEdad());
        assertTrue(cliente.esEstudiante());
        assertFalse(cliente.esTrabajador());
        assertTrue(cliente.esViveConPadres());
    }

    @Test
    void testSettersAndGetters() {
        Cliente cliente = new Cliente(0, false, false, false);
        cliente.setEdad(30);
        cliente.setEstudiante(true);
        cliente.setTrabajador(true);
        cliente.setViveConPadres(false);

        assertEquals(30, cliente.getEdad());
        assertTrue(cliente.esEstudiante());
        assertTrue(cliente.esTrabajador());
        assertFalse(cliente.esViveConPadres());
    }

    @Test
    void testTipoCuentaAfterSetterChanges() {
        Cliente cliente = new Cliente(30, false, true, true);
        Principal.tipoCuenta(cliente);
        assertEquals("Cuenta Independízate que va siendo hora", cliente.getTipoCuenta());

        cliente.setViveConPadres(false);
        Principal.tipoCuenta(cliente);
        assertEquals("Cuenta Bienvenido a la Vida Adulta", cliente.getTipoCuenta());
    }
}