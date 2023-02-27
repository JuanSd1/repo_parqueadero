package com.example.parqueadero.service.impl;

import com.example.parqueadero.entity.Tarifa;
import com.example.parqueadero.exceptions.ResourceNotFoundExcepcion;
import com.example.parqueadero.repository.TarifaRepository;
import com.example.parqueadero.service.TarifaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TarifaServiceImpl implements TarifaService {

    private final TarifaRepository tarifaRepository;

    @Override
    public List<Tarifa> getTarifa() throws Exception {
        try {

            var result = tarifaRepository.findAll();

            if (result.size() == 0) {
                throw new Exception("No hay tarifas registradas");
            }

            return result;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new Exception(e.getMessage());
            throw new ResourceNotFoundExcepcion("error");
        }
    }

    @Override
    public Tarifa saveTarifa(Tarifa tarifa) throws Exception {
        System.out.println(tarifa);
        return tarifaRepository.save(tarifa);
    }

    @Override
    public Optional<Tarifa> getTarifaById(Long id) throws Exception {
        try {

            if (id == null) {
                throw new Exception("Parametro de entrada nulo");
            }

            var result = tarifaRepository.findTarifaById(id);

            if (result == null) {
                throw new Exception("No se encontro la tarifa o no ah ingresao al parqueadero");
            }

            return Optional.of(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
