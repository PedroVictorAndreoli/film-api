package com.andreoli.pedro.demo.controller;

import com.andreoli.pedro.demo.service.impl.CrudServiceImpl;
import com.andreoli.pedro.demo.service.impl.EscritorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("escritor")
public class EscritorController extends CrudController<EscritorController>{
    @Autowired
    private EscritorService escritorService;

    @Override
    protected CrudServiceImpl crudService() {
        return escritorService;
    }
}
