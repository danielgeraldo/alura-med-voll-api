package br.com.dgsoft.alura.med.voll.api.model.dto.medico;

import br.com.dgsoft.alura.med.voll.api.model.dto.endereco.DadosEndereco;

public record DadosCadastroMedico (String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco){
}
