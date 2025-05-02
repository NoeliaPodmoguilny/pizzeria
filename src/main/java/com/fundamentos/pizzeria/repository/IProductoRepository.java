package com.fundamentos.pizzeria.repository;

import com.fundamentos.pizzeria.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
}
