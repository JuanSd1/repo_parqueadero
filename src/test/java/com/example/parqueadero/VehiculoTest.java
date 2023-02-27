package com.example.parqueadero;

import static org.junit.jupiter.api.Assertions.*;

import com.example.parqueadero.entity.Transaccion;
import com.example.parqueadero.entity.Vehiculo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class VehiculoTest {

    private Vehiculo vehiculo;
    private Transaccion transaccion;

    @BeforeEach
    public void setUp() {
        vehiculo = new Vehiculo();
        vehiculo.setPlaca("BFG86F");
        vehiculo.setModelo("Gsx-s 150");
        vehiculo.setMarca("Suzuki");
        vehiculo.setColor("Azul");
        List<Transaccion> transacciones = new ArrayList<>();
        transacciones.add(transaccion);
        vehiculo.setTransaccionList(transacciones);
    }

    @Test
    public void testGetPlaca() {

        String placaObtenida = vehiculo.getPlaca();
        assertEquals("BFG86F", placaObtenida);
    }

    @Test
    public void testGetModelo() {

        String modeloObtenido = vehiculo.getModelo();
        assertEquals("Gsx-s 150", modeloObtenido);
    }

    @Test
    public void testGetMarca() {

        String marcaObtenida = vehiculo.getMarca();
        assertEquals("Suzuki", marcaObtenida);
    }

    @Test
    public void testGetColor() {

        String colorObtenido = vehiculo.getColor();
        assertEquals("Azul", colorObtenido);
    }

    @Test
    public void testGetTransaccionList() {

        List<Transaccion> transaccionListObtenida = vehiculo.getTransaccionList();
        assertTrue(transaccionListObtenida.contains(transaccion));
    }
}

