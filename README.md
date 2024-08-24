# Projeto API RESTful com Spring Boot

Este projeto é uma API RESTful desenvolvida com Spring Boot, implementando as funcionalidades básicas conforme o modelo de maturidade de Richardson.

## Descrição

A API permite a criação, leitura, atualização e exclusão de produtos, utilizando os métodos HTTP padrões (`POST`, `GET`, `PUT`, `DELETE`). A API segue o modelo de maturidade de Richardson, alcançando o nível 3 ao utilizar HATEOAS (Hypermedia as the Engine of Application State) para adicionar links relevantes nas respostas das requisições.

## Estrutura do Projeto

### Camadas da Aplicação

1. **Controller**: Responsável por lidar com as requisições HTTP e retornar as respostas apropriadas.
   - Arquivo: `ProductController.java`
   
2. **DTO (Data Transfer Object)**: Define os objetos que serão usados para transferência de dados entre a camada de apresentação e a camada de serviço.
   - Arquivo: `ProductRecordDto.java`
   
3. **Model**: Representa a entidade de domínio da aplicação e a estrutura da tabela no banco de dados.
   - Arquivo: `ProductModel.java`
   
4. **Repository**: Interface que gerencia as operações de persistência da entidade `ProductModel`.
   - Arquivo: `ProductRepository.java`
   
### Funcionalidades Principais

1. **Criar Produto**:
   - Endpoint: `POST /products`
   - Descrição: Cria um novo produto na base de dados.
   - Payload: `name` (String), `value` (BigDecimal)
   - Exemplo de retorno: `201 Created`

2. **Listar Produtos**:
   - Endpoint: `GET /products`
   - Descrição: Retorna uma lista de todos os produtos cadastrados, com links HATEOAS.
   - Exemplo de retorno: `200 OK`

3. **Obter Detalhes de um Produto**:
   - Endpoint: `GET /products/{id}`
   - Descrição: Retorna os detalhes de um produto específico, identificado pelo seu ID.
   - Exemplo de retorno: `200 OK`

4. **Atualizar Produto**:
   - Endpoint: `PUT /products/{id}`
   - Descrição: Atualiza as informações de um produto específico.
   - Payload: `name` (String), `value` (BigDecimal)
   - Exemplo de retorno: `200 OK`

5. **Excluir Produto**:
   - Endpoint: `DELETE /products/{id}`
   - Descrição: Exclui um produto específico da base de dados.
   - Exemplo de retorno: `200 OK`

## Tecnologias Utilizadas

- **Spring Boot 3.1.5**: Framework principal para desenvolvimento da aplicação.
- **HATEOAS**: Para adicionar links relevantes nas respostas da API.
- **Jakarta Validation**: Para validação dos dados de entrada.
- **JPA/Hibernate**: Para mapeamento objeto-relacional (ORM) e manipulação da base de dados.
- **Pg Admin**: Banco de dados para desenvolvimento e testes.

## Como Executar

1. **Pré-requisitos**:
   - Java 17 ou superior
   - Maven 3.8.1 ou superior

2. **Passos**:
   - Clone o repositório:
     ```bash
     git clone https://github.com/usuario/projeto-api-restful.git
     ```
   - Navegue até a pasta do projeto:
     ```bash
     cd projeto-api-restful
     ```
   - Execute o comando para iniciar a aplicação:
     ```bash
     mvn spring-boot:run
     ```
   - Acesse a API através do endpoint: `http://localhost:8080/products`.

## Melhorias Futuras

- Implementação de paginação e filtragem nos endpoints de listagem.
- Customização de mensagens de erro e criação de uma camada de serviço.
- Adição de testes unitários e de integração.
- Manter a padronização de datas e internacionalização (i18n).

