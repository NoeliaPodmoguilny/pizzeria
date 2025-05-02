package com.fundamentos.pizzeria.service;

import java.util.List;

public interface ICrudService<T> {

    public T create(T entidad);
    public T readOne(int id);
    public List<T> readAll();
    public T update(T entidad);
    public String delete(int id);

}
