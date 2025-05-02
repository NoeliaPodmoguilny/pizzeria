package com.fundamentos.pizzeria.repository;

import com.fundamentos.pizzeria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
}
