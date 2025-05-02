package com.fundamentos.pizzeria.repository;

import com.fundamentos.pizzeria.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaRepository extends JpaRepository<Factura, Integer> {
}
