package com.example.parqueadero.repository;

import com.example.parqueadero.entity.Tarifa;
import com.example.parqueadero.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Tarifa entity
 */

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Long> {

    Tarifa findTarifaById(Long id);
}
