package br.com.dgsoft.alura.med.voll.api.model.request;

import lombok.Data;

@Data
public class MedicoDTO {
    private String nome;
    private String email;
    private String crm;
    private String especialidade;
    private EnderecoDTO endereco;


}

