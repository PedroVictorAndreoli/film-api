package com.andreoli.pedro.demo.service.impl;

import com.andreoli.pedro.demo.model.Escritor;
import com.andreoli.pedro.demo.repository.EscritorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EscritorService extends CrudServiceImpl<Escritor> {
    @Autowired
    EscritorRepository escritorRepository;

    @Override
    protected JpaRepository jpaRepository() {
        return escritorRepository;
    }
}
