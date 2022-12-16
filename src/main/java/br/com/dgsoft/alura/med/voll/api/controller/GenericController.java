package br.com.dgsoft.alura.med.voll.api.controller;

import br.com.dgsoft.alura.med.voll.api.service.impl.GenericServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


public class GenericController<T> {

    private GenericServiceImpl<T> service;

    public GenericController(GenericServiceImpl<T> service) {
        this.service = service;
    }

    @PostMapping
    public void cadastrar(@RequestBody T json){
        this.service.save(json);
    }

    @PutMapping("/{id}")
    public void atualizar(@RequestParam @RequestBody T json){
        this.service.save(json);
        System.out.print("Atualizar: "+json);
    }

}
