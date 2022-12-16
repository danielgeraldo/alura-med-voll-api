<h1 align="center">MedVollApi</h1>

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

Api para Estudo da Alura dos cursos de SpringBoot3, com customizações personalizadas

---
## Arquitetura e Tecnologias utilizadas

API java com SpringBoot

|     Tecnologia     | Versão  |
|:------------------:|:-------:|
|       Maven        |   3.8   |
|        Java        |   17    |
|    Spring Boot     |  3.0.0  |
| SpringDoc-WebMvcUi |  2.0.0  |
|       Lombok       | 1.18.24 |


---
## Execução em Ambiente Local

### Pré-requisitos

Para a execução deste projeto, é necessário os seguintes pré-requisitos instalados na máquina do desenvolvedor e/ou servidor:

- Java JDK 17
- Apache Maven 3.8

### Primeira execução

Siga os passos a seguir caso esta seja a primeira vez que o projeto está sendo executado na máquina.

- Baixar o repositório git
- Rodar o comando maven para baixar as dependencias    
```
mvn clean install
```

### Executando via linha de comando

O comando abaixo é responsável por inicializar o projeto via linha de comando, para o profile local.

```
mvn spring-boot:run -Dspring.profile.active=loc
```

Nos parâmetros de execução informar o parametro com profile que será executado 

- Exemplo de execução do profile Local:
```
mvn spring-boot:run -Dspring.profiles.active=loc
```


- Exemplo de execução do profile Desenvolvimento:
```
mvn spring-boot:run -Dspring.profiles.active=dsv
```

---
## Documentação

Documentação dos Controllers e Métodos de API, utilizando SpringDoc.<br>
Inteface web da documentação Local podendo ser acessada através da url abaixo:

|   Ambiente   |                           Endereço                                                       |
|:------------:|:-----------------------------------------------------------------------------------------|
|     Local    |http://localhost:8081/med-voll-api/swagger-ui.html

---
## Métricas e Cobertura de Testes
O projeto utilizar o Plugin jacoco-maven-plugin, que possibilita a geração do report para verificar a cobertura de testes unitários implementados na api.

Para validar o coverage basta executar o comando abaixo: 

```
mvn jacoco:report
```

Após a execução com sucesso, será criada na sua aplicação, dentro da pastar target, o diretorio *site* que possuirá o resultado gerado pelo report do jacoco.<br>
Basta abrir o arquivo target/site/jacoco/index.html para poder visualizar no seu navegador o conteúdo gerado.

---
## Git

O projeto encontra-se armazenado no [repositório git](https://github.com/danielgeraldo/alura-med-voll-api.git
).

### Versão Corrente

Atualmente se encontra em produção a branch do git: release-1.0.0

#### Criação de Nova Branch

Para criação de nova branch, validar se o ultimo hash enviado para produção já teve merge realizado na Master.<br>
Derivar branch de desenvolvimento a partir da Master.

<br>