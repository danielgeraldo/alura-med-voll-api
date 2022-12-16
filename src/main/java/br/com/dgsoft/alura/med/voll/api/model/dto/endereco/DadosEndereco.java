package br.com.dgsoft.alura.med.voll.api.model.dto.endereco;

public record DadosEndereco(String logradouro,
                            String bairro,
                            String cep,
                            String cidade,
                            String uf,
                            Long numero,
                            String complemento){
}
