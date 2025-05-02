package com.fundamentos.pizzeria.service;

import com.fundamentos.pizzeria.model.Pedido;
import com.fundamentos.pizzeria.repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PedidoService implements ICrudService<Pedido>{

    @Autowired
    private IPedidoRepository pedidoRepo;

    @Override
    public Pedido create(Pedido entidad) {
        return pedidoRepo.save(entidad);
    }

    @Override
    public Pedido readOne(int id) {
        return pedidoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Pedido> readAll() {
        return pedidoRepo.findAll();
    }

    @Override
    public Pedido update(Pedido entidad) {

        Pedido pedidoAModificar = this.readOne(entidad.getId());

        pedidoAModificar.setCliente(entidad.getCliente());
        pedidoAModificar.setFactura(entidad.getFactura());

        return pedidoRepo.save(pedidoAModificar);
    }

    @Override
    public String delete(int id) {
        pedidoRepo.deleteById(id);
        return "Pedido eliminado";
    }
}
