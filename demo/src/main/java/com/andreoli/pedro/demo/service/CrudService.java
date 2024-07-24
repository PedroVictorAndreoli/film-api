package com.andreoli.pedro.demo.service;

public interface CrudService<T> {
    public void save(T t);
    public void delete(T t);
    public void update(Long id,T t);
    public T findById(Long id);
}
