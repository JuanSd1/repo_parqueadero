package com.example.parqueadero.controller;

//import com.example.parqueadero.DTO.TransaccionDTO;
import com.example.parqueadero.entity.Transaccion;
import com.example.parqueadero.service.TransaccionService;
import com.example.parqueadero.utilities.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = Constans.PATH_TRANSACCION)
public class TransaccionController {

    @Autowired
    private TransaccionService transaccionService;

    @GetMapping
    public List<Transaccion> getTransaccion() throws Exception{
        return transaccionService.getTransaccion();
    }

    @PostMapping
    public void saveTransaccion(@RequestBody Transaccion transaccion) throws Exception{
        transaccionService.saveTransaccion(transaccion);
    }

    @PutMapping(path = Constans.PATH_TRANSACCION_UPDATE)
    public ResponseEntity<Transaccion> updateTransaccion(@PathVariable Long id, @RequestBody Transaccion transaccion) throws Exception{
        return transaccionService.updateTransaccion(transaccion);
    }

    @GetMapping(path = Constans.PATH_TRANSACCION_ID)
    public Optional<Transaccion> getTransaccionByCliente(@PathVariable("id") Long cedula) throws Exception{
        return transaccionService.getTransaccionByCliente(cedula);
    }
}
