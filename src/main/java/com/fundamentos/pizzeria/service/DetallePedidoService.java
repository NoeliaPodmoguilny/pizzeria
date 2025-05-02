package com.fundamentos.pizzeria.service;

import com.fundamentos.pizzeria.model.DetallePedido;
import com.fundamentos.pizzeria.repository.IDetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetallePedidoService implements ICrudService<DetallePedido>{

    @Autowired
    private IDetallePedidoRepository detallePedidoRepo;

    @Override
    public DetallePedido create(DetallePedido entidad) {
        return detallePedidoRepo.save(entidad);
    }

    @Override
    public DetallePedido readOne(int id) {
        return detallePedidoRepo.findById(id).orElse(null);
    }

    @Override
    public List<DetallePedido> readAll() {
        return detallePedidoRepo.findAll();
    }

    @Override
    public DetallePedido update(DetallePedido entidad) {

        DetallePedido detalleAModificar = this.readOne(entidad.getId());

        detalleAModificar.setPedido(entidad.getPedido());
        detalleAModificar.setCantidad(entidad.getCantidad());
        detalleAModificar.setProducto(entidad.getProducto());
        detalleAModificar.setSubtotal(entidad.getSubtotal());

        return detallePedidoRepo.save(detalleAModificar);
    }

    @Override
    public String delete(int id) {
        detallePedidoRepo.deleteById(id);
        return "Detalle eliminado";
    }
}
