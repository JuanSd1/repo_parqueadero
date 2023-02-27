package com.example.parqueadero;

import com.example.parqueadero.entity.Cliente;
import com.example.parqueadero.entity.Transaccion;
import com.example.parqueadero.entity.Vehiculo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class TransaccionTest {

    @Mock
    private Cliente cliente;

    @Mock
    private Vehiculo vehiculo;

    private Transaccion transaccion;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        transaccion = new Transaccion();
        transaccion.setCliente(cliente);
        transaccion.setVehiculo(vehiculo);
        transaccion.setHoraEntrada("08:00");
        transaccion.setHoraSalida("12:00");
        transaccion.setMontoTotal(10000l);
    }

    @Test
    public void testGetCliente() {

        Cliente clienteObtenido = transaccion.getCliente();
        assertEquals(cliente, clienteObtenido);
    }

    @Test
    public void testGetVehiculo() {

        Vehiculo vehiculoObtenido = transaccion.getVehiculo();
        assertEquals(vehiculo, vehiculoObtenido);
    }

    @Test
    public void testSetHoraEntrada() {

        String nuevaHoraEntrada = "09:00";

        transaccion.setHoraEntrada(nuevaHoraEntrada);
        String horaEntradaObtenida = transaccion.getHoraEntrada();

        assertEquals(nuevaHoraEntrada, horaEntradaObtenida);
    }

    @Test
    public void testGetMontoTotal() {

        Long montoTotalObtenido = transaccion.getMontoTotal();
        assertEquals(Long.valueOf(10000l), montoTotalObtenido);
    }

}
