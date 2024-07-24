package com.andreoli.pedro.demo.service.impl;

import com.andreoli.pedro.demo.model.Escritor_Filme;
import com.andreoli.pedro.demo.repository.Escritor_FilmeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class Escritor_FilmeService extends CrudServiceImpl<Escritor_Filme> {
    Escritor_FilmeRepository repo;
    @Override
    protected JpaRepository jpaRepository() {
        return repo;
    }
}
