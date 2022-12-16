<h1 align="center">Tripag Backoffice Atendimento Web</h1>

<p  align="center">
  <a  href="#objetivo">Objetivo</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a  href="#arquitetura-e-tecnologias-utilizadas">Arquitetura</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a  href="#execução-em-ambiente-local">Execução</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a  href="#documentação">Documentação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a  href="#métricas-e-cobertura-de-testes">Testes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a  href="#jenkins">Jenkins</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a  href="#git">Git</a>
</p>

## Objetivo

Exibição da área restrita a atendentes, em que os mesmos podem realizar ações como:
- Listar todos os estabelecimentos da rede;
- Realizar pesquisas por dados do estabelecimento (CNPJ, Razão Social, Número EC...);
- Solicitar negociações especiais de taxas e condições para diferentes bandeiras e equipamentos;
- Ativar e desativar serviços;
- Acessar o Portal do Cliente;

---
## Arquitetura e Tecnologias utilizadas

API java com SpringBoot

| Tecnologia | Versão |
| :--------: | :----: |
|   NodeJS   | 8.11.1 |
|  Angular   | 1.5.7  |
|   Bower    | 1.8.4  |
|    Gulp    | 3.9.1  |
|   Moment   | 2.22.1 |

---
## Execução em Ambiente Local

### Pré-requisitos

Para a execução deste projeto, é necessário os seguintes pré-requisitos instalados na máquina do desenvolvedor e/ou servidor:

- NodeJS 8.11.1
- npm 5.6.0

### Primeira execução

Siga os passos a seguir caso esta seja a primeira vez que o projeto está sendo executado na máquina.

- Baixar o repositório git, assim como os sub-repositórios

- Rodar o comando npm para baixar as dependencias    
```
npm install
```

### Executando via linha de comando

O comando abaixo é responsável por inicializar o projeto via linha de comando, para o ambiente local.

```
gulp serve local
```
Caso haja alterações no sub-repositório corp-componentes-web, executar o comando sem limpar as alterações, com o comando abaixo:
```
gulp serve local --update-components=false
```

> <br>
> Nos parâmetros de execução informar o ambiente que será executado 
> 
> - Exemplo de execução do ambiente local:
> ```
> gulp serve local
> ```
>
> - Exemplo de execução do ambiente de desenvolvimento:
> ```
> gulp serve dsv
> ```
> <br>

---
## Documentação

### Documentação Confluence

A documentação com regras de negócio, refinamentos técnicos e outros detalhes estão disponíveis na [página do Confluence deste projeto](https://confluence.tribanco.com.br/pages/viewpage.action?spaceKey=BCD&title=TI+Portais).

## Métricas e Cobertura de Testes
O projeto utiliza o pacote jest para execução de testes.

Para validar o coverage basta executar o comando abaixo:

```
npm run jest --coverage
```

### Sonar

Todos os projetos executados no Jenkins tem suas métricas avaliadas pelo Sonar.
Sonar é uma ferramenta que avalia não apenas a correta execução dos testes, mas também sua cobertura,
a presença de problemas (ou *issues*), verificação de boas práticas e outros indicadores.

Uma nova versão de um projeto deve ter no mínimo uma cobertura de 80% nos
testes unitários e apresentar um número igual ou superior de indicadores de
qualidade (ou igual/menor nos indicadores de pendências).

Links para acessar o sonar de diferentes ambientes abaixo:

| Ambiente | Endereço                                                                                           |
| :------: | :------------------------------------------------------------------------------------------------- |
|   DSV    | https://trbsnrprd02.tribanco.com.br/dashboard?id=adquirencia-tripag-backoffice-atendimento-web     |
|   HML    | https://trbsnrprd02.tribanco.com.br/dashboard?id=adquirencia-tripag-backoffice-atendimento-web-hml |
|   PRD    | https://trbsnrprd02.tribanco.com.br/dashboard?id=adquirencia-tripag-backoffice-atendimento-web-prd |

---
## Jenkins

Como a api já está em Kubernetes, rodar no ambiente desejado selecionando a operação conforme abaixo:<br>
Application: operacao-business-api

| Ambiente | Endereço                                                                                     |
| :------: | :------------------------------------------------------------------------------------------- |
|   DSV    | http://jenkinsdsv.tribanco.com.br/job/adquirencia/job/tripag-backoffice-atendimento-web      |
|   HML    | http://jenkinsdsh.tribanco.com.br:8080/job/adquirencia/job/tripag-backoffice-atendimento-web |

### Monitoramento

Será criado um processo de monitoramento do portal via zabbix juntamente com a equipe de OCC para alarmar caso o portal saia do ar.

---
## Git

O projeto encontra-se armazenado no [repositório do gitlab interno do Tribanco](http://git.tribanco.com.br/adquirencia/tripag-backoffice-atendimento-web).

### Versão Corrente

Atualmente se encontra em produção a branch do git: release-1.34.0

#### Criação de Nova Branch

Para criação de nova branch, validar se o ultimo hash enviado para produção já teve merge realizado na Master.<br>
Derivar branch de desenvolvimento a partir da Master.

<br>