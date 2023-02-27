package com.example.parqueadero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.parqueadero.entity.Tarifa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TarifaTest {

    private Tarifa tarifa;

    @BeforeEach
    public void setUp() {
        tarifa = new Tarifa();
        tarifa.setTipoVehiculo("Carro");
        tarifa.setPrecioHora(2000.0);
    }

    @Test
    public void testGetTipoVehiculo() {

        String tipoVehiculoObtenido = tarifa.getTipoVehiculo();
        assertEquals("Carro", tipoVehiculoObtenido);
    }

    @Test
    public void testGetPrecioHora() {

        double precioHoraObtenido = tarifa.getPrecioHora();
        assertEquals(2000.0, precioHoraObtenido);
    }
}

