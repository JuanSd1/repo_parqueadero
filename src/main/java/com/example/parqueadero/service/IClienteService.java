package com.example.parqueadero.service;

import com.example.parqueadero.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    List<Cliente> getClient() throws Exception;
    Cliente saveClient(Cliente cliente) throws Exception;
    Optional<Cliente> getClient(Long id) throws Exception;
}
