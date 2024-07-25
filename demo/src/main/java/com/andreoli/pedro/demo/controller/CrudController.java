package com.andreoli.pedro.demo.controller;

import com.andreoli.pedro.demo.service.impl.CrudServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public void delete(@PathVariable Long id){
        crudService().delete(id);
    }

    @GetMapping("{id}")
    public ResponseEntity<T> buscaId(@PathVariable Long id){
        return ResponseEntity.ok( (T) crudService().findById(id));
    }
}
