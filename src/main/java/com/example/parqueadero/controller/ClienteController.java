package com.example.parqueadero.controller;

import com.example.parqueadero.entity.Cliente;
import com.example.parqueadero.service.IClienteService;
import com.example.parqueadero.utilities.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = Constans.PATH_CLIENTE)
public class ClienteController {

    @Autowired
    private IClienteService iClienteService;

    @GetMapping
    public List<Cliente> getClient() throws Exception{
        return iClienteService.getClient();
    }

    @PostMapping
    public Cliente saveClient(@RequestBody Cliente cliente) throws Exception{
        return iClienteService.saveClient(cliente);
    }

    @GetMapping(path = Constans.PATH_CLIENTE_ID)
    public Optional<Cliente> getClient(@PathVariable("id") Long id) throws Exception{
        return iClienteService.getClient(id);
    }

}