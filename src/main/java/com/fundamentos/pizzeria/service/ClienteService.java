package com.fundamentos.pizzeria.service;

import com.fundamentos.pizzeria.model.Cliente;
import com.fundamentos.pizzeria.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService implements ICrudService<Cliente> {

    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public Cliente create(Cliente entidad) {
        return clienteRepo.save(entidad);
    }

    @Override
    public Cliente readOne(int id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public List<Cliente> readAll() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente update(Cliente entidad) {

        Cliente clienteAModificar = this.readOne(entidad.getId());

        clienteAModificar.setNombre(entidad.getNombre());
        clienteAModificar.setApellido(entidad.getApellido());
        clienteAModificar.setDni(entidad.getDni());
        clienteAModificar.setCalle(entidad.getCalle());
        clienteAModificar.setAltura(entidad.getAltura());
        clienteAModificar.setTelefono(entidad.getTelefono());

        return clienteRepo.save(clienteAModificar);
    }

    @Override
    public String delete(int id) {
        clienteRepo.deleteById(id);
        return "Cliente eliminado";
    }
}
