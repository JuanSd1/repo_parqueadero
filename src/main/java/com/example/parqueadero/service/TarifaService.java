package com.example.parqueadero.service;

import com.example.parqueadero.entity.Tarifa;

import java.util.List;
import java.util.Optional;

public interface TarifaService {

    List<Tarifa> getTarifa() throws Exception;
    Tarifa saveTarifa(Tarifa tarifa) throws Exception;
    Optional<Tarifa> getTarifaById(Long id) throws Exception;
}
