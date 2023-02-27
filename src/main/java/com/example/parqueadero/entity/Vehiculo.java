package com.example.parqueadero.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "placa_vehiculo")
    private String placa;
    @Column(name = "modelo_vehiculo")
    private String modelo;
    @Column(name = "marca_vehiculo")
    private String marca;
    @Column(name = "color_vehiculo")
    private String color;
    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaccion> transaccionList;

}
