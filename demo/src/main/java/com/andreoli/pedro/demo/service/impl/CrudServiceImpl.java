package com.andreoli.pedro.demo.service.impl;

import com.andreoli.pedro.demo.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.beans.BeanUtils.copyProperties;

public abstract class CrudServiceImpl<T> implements CrudService<T> {
    protected abstract JpaRepository jpaRepository();

    @Override
    public void save(T t) {
        jpaRepository().save(t);
    }
    @Override
    public void delete(Long id) {
        jpaRepository().deleteById(id);
    }

    @Override
    public void update(Long id,T t) {
        Optional<T> existingEntity = jpaRepository().findById(id);
        if (existingEntity.isPresent()) {
            T entityToUpdate = existingEntity.get();
            copyProperties(t, entityToUpdate);
            jpaRepository().save(entityToUpdate);
        }
    }
    @Override
    public T findById(Long id) {
        return (T) jpaRepository().findById(id);
    }
}
