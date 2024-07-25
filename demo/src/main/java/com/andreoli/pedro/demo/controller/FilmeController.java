package com.andreoli.pedro.demo.controller;

import com.andreoli.pedro.demo.model.Filme;
import com.andreoli.pedro.demo.service.impl.CrudServiceImpl;
import com.andreoli.pedro.demo.service.impl.EscritorService;
import com.andreoli.pedro.demo.service.impl.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("filme")
public class FilmeController extends CrudController<Filme>{
    @Autowired
    private FilmeService filmeService;
    @Override
    protected CrudServiceImpl crudService() {
        return filmeService;
    }
}
