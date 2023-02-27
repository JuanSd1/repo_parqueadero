package com.example.parqueadero.entity;

import com.example.parqueadero.repository.ClienteRepository;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaccion")
public class Transaccion {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;
    @Column(name = "hora_ingreso")
    private String horaEntrada;
    @Column(name = "hora_salida")
    private String horaSalida;
    @Column(name = "total")
    private Long  montoTotal;

}
