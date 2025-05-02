package com.fundamentos.pizzeria.repository;

import com.fundamentos.pizzeria.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
}
