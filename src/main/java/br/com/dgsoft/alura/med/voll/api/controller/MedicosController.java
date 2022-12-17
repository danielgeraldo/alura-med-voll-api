package br.com.dgsoft.alura.med.voll.api.controller;

import br.com.dgsoft.alura.med.voll.api.model.data.medico.Medico;
import br.com.dgsoft.alura.med.voll.api.service.MedicoService;
import br.com.dgsoft.alura.med.voll.api.service.impl.MedicoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicosController extends GenericController<Medico> {

    public MedicosController(@Autowired MedicoServiceImpl service) {
        super(service);
    }
}
