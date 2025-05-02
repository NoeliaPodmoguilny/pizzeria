package com.fundamentos.pizzeria.service;

import com.fundamentos.pizzeria.model.Producto;
import com.fundamentos.pizzeria.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductoService implements ICrudService<Producto> {

    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public Producto create(Producto entidad) {
        return productoRepo.save(entidad);
    }

    @Override
    public Producto readOne(int id) {
        return productoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Producto> readAll() {
        return productoRepo.findAll();
    }

    @Override
    public Producto update(Producto entidad) {

        Producto productoAModificar = this.readOne(entidad.getId());

        productoAModificar.setNombre(entidad.getNombre());
        productoAModificar.setPrecio(entidad.getPrecio());
        productoAModificar.setTamanio(entidad.getTamanio());

        return productoRepo.save(productoAModificar);
    }

    @Override
    public String delete(int id) {
        productoRepo.deleteById(id);
        return "Producto eliminado";
    }
}
