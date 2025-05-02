package com.fundamentos.pizzeria.repository;

import com.fundamentos.pizzeria.model.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetallePedidoRepository extends JpaRepository<DetallePedido, Integer> {
}
