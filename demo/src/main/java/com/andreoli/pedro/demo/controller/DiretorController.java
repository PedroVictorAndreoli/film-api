package com.andreoli.pedro.demo.controller;

import com.andreoli.pedro.demo.model.Diretor;
import com.andreoli.pedro.demo.service.impl.CrudServiceImpl;
import com.andreoli.pedro.demo.service.impl.DiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("diretor")
public class DiretorController extends CrudController<Diretor> {
    @Autowired
    private DiretorService diretorService;
    @Override
    protected CrudServiceImpl crudService() {
        return diretorService;
    }
}
