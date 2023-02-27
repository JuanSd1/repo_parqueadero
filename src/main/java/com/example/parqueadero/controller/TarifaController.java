package com.example.parqueadero.controller;

import com.example.parqueadero.entity.Tarifa;
import com.example.parqueadero.service.TarifaService;
import com.example.parqueadero.utilities.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = Constans.PATH_TARIFA)
public class TarifaController {

    @Autowired
    private TarifaService tarifaService;

    @GetMapping
    public List<Tarifa> getTarifa() throws Exception{
        return tarifaService.getTarifa();
    }

    @PostMapping
    public Tarifa saveTarifa(@RequestBody Tarifa tarifa) throws Exception{
        return tarifaService.saveTarifa(tarifa);
    }

    @GetMapping(path = Constans.PATH_TARIFA_ID)
    public Optional<Tarifa> getTarifaById(@PathVariable("id") Long id) throws Exception{
        return tarifaService.getTarifaById(id);
    }
}
