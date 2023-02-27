package com.example.parqueadero.repository;

import com.example.parqueadero.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Cliente entity
 */

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
