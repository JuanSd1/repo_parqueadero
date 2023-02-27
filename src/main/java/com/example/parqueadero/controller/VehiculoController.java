package com.example.parqueadero.controller;

import com.example.parqueadero.entity.Vehiculo;
import com.example.parqueadero.service.IVehiculoService;
import com.example.parqueadero.utilities.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = Constans.PATH_VEHICULO)
public class VehiculoController {

    @Autowired
    private IVehiculoService iVehiculoService;

    @GetMapping
    public List<Vehiculo> getVehiculos() throws Exception{
        return iVehiculoService.getVehiculos();
    }

    @PostMapping
    public Vehiculo saveVehiculo(@RequestBody Vehiculo vehiculo) throws Exception{
        return iVehiculoService.saveVehiculo(vehiculo);
    }

    @GetMapping(path = Constans.PATH_VEHICULO_ID)
    public Optional<Vehiculo> getVehiculo(@PathVariable("id") Long id) throws Exception{
        return  iVehiculoService.getVehiculo(id);
    }
}
