package com.andreoli.pedro.demo.controller;

import com.andreoli.pedro.demo.service.impl.CrudServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CrudController<T> {

    protected abstract CrudServiceImpl crudService();


    @PostMapping
    public void create(@RequestBody T entity){
        crudService().save(entity);
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody T entity){
        crudService().update(id, entity);
    }

    @DeleteMapping("{id}")

}
