package com.example.parqueadero.service;

import com.example.parqueadero.entity.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface IVehiculoService {
    List<Vehiculo> getVehiculos() throws Exception;

    Vehiculo saveVehiculo(Vehiculo vehiculo) throws Exception;

    Optional<Vehiculo> getVehiculo(Long id) throws Exception;

}
