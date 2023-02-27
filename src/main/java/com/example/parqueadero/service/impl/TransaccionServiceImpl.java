package com.example.parqueadero.service.impl;

//import com.example.parqueadero.DTO.TransaccionDTO;
import com.example.parqueadero.entity.Cliente;
import com.example.parqueadero.entity.Transaccion;
import com.example.parqueadero.exceptions.ResourceNotFoundExcepcion;
import com.example.parqueadero.repository.ClienteRepository;
import com.example.parqueadero.repository.TransaccionRepository;
import com.example.parqueadero.repository.VehiculoRepository;
import com.example.parqueadero.service.TransaccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransaccionServiceImpl implements TransaccionService {

    @Autowired
    private final TransaccionRepository transaccionRepository;
    private final ClienteRepository clienteRepository;
    private final VehiculoRepository vehiculoRepository;


    @Override
    public List<Transaccion> getTransaccion() throws Exception {
        try {

            var result = transaccionRepository.findAll();

            if (result.size() == 0) {
                throw new Exception("No hay Transacciones registradas");
            }

            return result;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new Exception(e.getMessage());
            throw new ResourceNotFoundExcepcion("error");
        }
    }

    /*@Override
    public Transaccion saveTransaccion(TransaccionDTO transaccionDTO) throws Exception {
        try {

            if (Objects.isNull(transaccionDTO)) {
                throw new Exception("Parametro de entrada nulo");
            }

            ModelMapper mapper = new ModelMapper();
            Transaccion transaccion = mapper.map(transaccionDTO, Transaccion.class);

            Transaccion transaccion1 = new Transaccion();
            System.out.println(transaccion);
            return transaccionRepository.save(transaccion1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }

    }*/
    @Override
    public Transaccion saveTransaccion(Transaccion transaccion) throws Exception{
        System.out.println(transaccion);
        return transaccionRepository.save(transaccion);
    }


    /*public Transaccion saveTransaccion(TransaccionDTO transaccionDTO) throws Exception {
        try {
            if (Objects.isNull(transaccionDTO)) {
                throw new Exception("Parametro de entrada nulo");
            }

            ModelMapper mapper = new ModelMapper();
            Transaccion transaccion = mapper.map(transaccionDTO, Transaccion.class);

            Cliente cliente = clienteRepository.findById(transaccionDTO.getClienteId())
                    .orElseThrow(() -> new Exception("No se encontró el cliente"));
            transaccion.setCliente(cliente);

            Vehiculo vehiculo = vehiculoRepository.findById(transaccionDTO.getVehiculoId())
                    .orElseThrow(() -> new Exception("No se encontró el vehículo"));
            transaccion.setVehiculo(vehiculo);

            return transaccionRepository.save(transaccion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }*/

    @Override
    public ResponseEntity<Transaccion> updateTransaccion(Transaccion transaccion) throws Exception {
        return null;
    }

    @Override
    public Optional<Transaccion> getTransaccionByCliente(Long cedula) throws Exception {
        try {

            if (cedula == null) {
                throw new Exception("Parametro de entrada nulo");
            }


            var result = transaccionRepository.findTransaccionByClienteCedula(cedula);

            if (result == null) {
                throw new Exception("No se encontro el cliente o no ah ingresao al parqueadero");
            }

            return Optional.of(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
