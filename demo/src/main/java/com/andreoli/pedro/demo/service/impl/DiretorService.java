package com.andreoli.pedro.demo.service.impl;

import com.andreoli.pedro.demo.model.Diretor;
import com.andreoli.pedro.demo.repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DiretorService extends CrudServiceImpl<Diretor>{
    @Autowired
    private DiretorRepository diretorRepository;

    @Override
    protected JpaRepository jpaRepository() {
        return diretorRepository;
    }
}
