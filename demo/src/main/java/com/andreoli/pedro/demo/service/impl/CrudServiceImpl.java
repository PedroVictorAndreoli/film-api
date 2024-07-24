package com.andreoli.pedro.demo.service.impl;

import com.andreoli.pedro.demo.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

public abstract class CrudServiceImpl<T> implements CrudService<T> {
    protected abstract JpaRepository jpaRepository();

    @Override
    public void save(T t) {
        jpaRepository().save(t);
    }

    @Override
    public void delete(T t) {
        jpaRepository().delete(t);
    }

    @Override
    public void update(Long id,T t) {
       if(jpaRepository().existsById(id)) {
           jpaRepository().save(t);
       }
    }

    @Override
    public T findById(Long id) {
        return (T) jpaRepository().findById(id);
    }
}
