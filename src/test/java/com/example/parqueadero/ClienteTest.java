package com.example.parqueadero;

import com.example.parqueadero.entity.Cliente;
import com.example.parqueadero.entity.Transaccion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Mock
    private Transaccion transaccion;

    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cliente = new Cliente();
        cliente.setCedula(1193080568L);
        cliente.setNombre("Sebastian");
        cliente.setTelefono("3001300612");
        List<Transaccion> transacciones = new ArrayList<>();
        transacciones.add(transaccion);
        cliente.setTransaccionList(transacciones);
    }

    @Test
    public void testGetCedula() {

        Long cedulaObtenida = cliente.getCedula();
        assertEquals(Long.valueOf(1193080568L), cedulaObtenida);
    }

    @Test
    public void testGetNombre() {

        String nombreObtenido = cliente.getNombre();
        assertEquals("Sebastian", nombreObtenido);
    }

    @Test
    public void testGetTelefono() {

        String telefonoObtenido = cliente.getTelefono();
        assertEquals("3001300612", telefonoObtenido);
    }

    @Test
    public void testGetTransaccionList() {

        List<Transaccion> transaccionListObtenida = cliente.getTransaccionList();
        assertTrue(transaccionListObtenida.contains(transaccion));
    }
}
