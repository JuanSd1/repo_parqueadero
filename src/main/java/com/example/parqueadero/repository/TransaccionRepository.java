package com.example.parqueadero.repository;

import com.example.parqueadero.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Repository Transaccion entity
 */

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    Transaccion findTransaccionByClienteCedula(Long id);
}
