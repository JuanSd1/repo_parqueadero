package com.example.parqueadero.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cedula_cliente")
    private Long cedula;
    @Column(name = "nombre_cliente")
    private String nombre;
    @Column(name = "telefono_cliente")
    private String telefono;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaccion> transaccionList;

}
