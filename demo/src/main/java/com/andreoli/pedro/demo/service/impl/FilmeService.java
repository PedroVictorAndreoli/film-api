package com.andreoli.pedro.demo.service.impl;

import com.andreoli.pedro.demo.model.Filme;
import com.andreoli.pedro.demo.repository.FilmeRepository;
import com.andreoli.pedro.demo.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FilmeService extends CrudServiceImpl<Filme> {
    @Autowired
    private FilmeRepository filmeRepository;
    @Override
    protected JpaRepository jpaRepository() {
        return filmeRepository;
    }
}
