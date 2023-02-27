package com.example.parqueadero.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_cliente")
    private String nombre;
    @Column(name = "telefono_cliente")
    private String telefono;
}
