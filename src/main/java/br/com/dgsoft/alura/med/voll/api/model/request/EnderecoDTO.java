package br.com.dgsoft.alura.med.voll.api.model.request;

import lombok.Data;

@Data
public class EnderecoDTO {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private Long numero;
    private String complemento;
}
