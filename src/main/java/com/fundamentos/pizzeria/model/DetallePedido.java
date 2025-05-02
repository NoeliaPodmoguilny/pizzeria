package com.fundamentos.pizzeria.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Producto producto;
    @OneToOne
    private Pedido pedido;
    private int cantidad;
    private double subtotal;
}
