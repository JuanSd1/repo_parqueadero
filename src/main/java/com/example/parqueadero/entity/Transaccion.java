package com.example.parqueadero.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaccion")
public class Transaccion {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private int idCliente;
    private int idVehiculo;
    private int idEspacio;
    private Date fechaHoraEntrada;
    private Date fechaHoraSalida;
    private double montoTotal;
}
