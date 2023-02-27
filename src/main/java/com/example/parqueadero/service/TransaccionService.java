package com.example.parqueadero.service;

//import com.example.parqueadero.DTO.TransaccionDTO;
import com.example.parqueadero.entity.Transaccion;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface TransaccionService {

    List<Transaccion> getTransaccion() throws Exception;

    //Transaccion saveTransaccion(TransaccionDTO transaccion) throws Exception;

    Transaccion saveTransaccion(Transaccion transaccion) throws Exception;

    ResponseEntity<Transaccion> updateTransaccion(Transaccion transaccion) throws Exception;

    Optional<Transaccion> getTransaccionByCliente(Long cedula) throws Exception;

}
