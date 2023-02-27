package com.example.parqueadero.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tarifa")
public class Tarifa {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo_vehiculo")
    private String tipoVehiculo;
    @Column(name = "precio_hora")
    private double precioHora;
}
