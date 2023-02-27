package com.example.parqueadero.service.impl;

import com.example.parqueadero.entity.Vehiculo;
import com.example.parqueadero.repository.VehiculoRepository;
import com.example.parqueadero.service.IVehiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehiculoServiceImpl implements IVehiculoService {

    private final VehiculoRepository vehiculoRepository;

    @Override
    public List<Vehiculo> getVehiculos() throws Exception {
        try {

            var result = vehiculoRepository.findAll();

            if (result.size() == 0){
                throw new Exception("No hay vehiculos registrados");
            }

            return result;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Vehiculo saveVehiculo(Vehiculo vehiculo) throws Exception {

        try {

            if (Objects.isNull(vehiculo)) {
                throw new Exception("Parametro de entrada nulo");
            }

            return vehiculoRepository.save(vehiculo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public Optional<Vehiculo> getVehiculo(Long id) throws Exception {
        try {

            if (id == null) {
                throw new Exception("Parametro de entrada nulo");
            }

            var result = vehiculoRepository.findById(id).orElseThrow(
                    () -> new Exception("No se encontro el vehiculo")
            );

            return Optional.ofNullable(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
