package br.com.dgsoft.alura.med.voll.api.controller;

import br.com.dgsoft.alura.med.voll.api.model.request.MedicoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class BaseController<T> {

    @PostMapping
    public void cadastrar(@RequestBody T json){
        System.out.print("Cadastrar: "+json);
    }

    @PutMapping
    public void atualizar(@RequestBody T json){
        System.out.print("Atualizar: "+json);
    }

}
