package com.fundamentos.pizzeria.service;

import com.fundamentos.pizzeria.model.Factura;
import com.fundamentos.pizzeria.repository.IFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FacturaService implements ICrudService<Factura> {

    @Autowired
    private IFacturaRepository facturaRepo;

    @Override
    public Factura create(Factura entidad) {
        return facturaRepo.save(entidad);
    }

    @Override
    public Factura readOne(int id) {
        return facturaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Factura> readAll() {
        return facturaRepo.findAll();
    }

    @Override
    public Factura update(Factura entidad) {

        Factura facturaAModificar = this.readOne(entidad.getId());

        facturaAModificar.setFecha(entidad.getFecha());
        facturaAModificar.setNumeroDeSerie(entidad.getNumeroDeSerie());
        facturaAModificar.setMontoTotal(entidad.getMontoTotal());

        return facturaRepo.save(facturaAModificar);
    }

    @Override
    public String delete(int id) {
        facturaRepo.deleteById(id);
        return "Factura elimianda";
    }
}
