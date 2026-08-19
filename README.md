# Desafio Projeto Spring Boot estruturado - Java Spring Professional

Projeto desenvolvido como parte do quinto desafio da formação Java Spring Professional, da plataforma Devsuperior

## Tecnologias

- Java 21
- Spring Boot 4.1.0
- Spring Data JPA
- Banco de dados H2
- Bean Validation
- Spring Security
- OAuth2 (Authorization e Resource server)
- Maven

## Objetivo

O objetivo é fazer a implementação do Spring Security com OAuth2 (Authorization Server, Resource Server). Realizar controle de acesso de acordo com as permissões do usuário. Respostas customizadas e status HTTP correto para feedback de usuário. Regras de validação.

## Testes

Para facilitar os testes. Esta disponibilizado nos arquivos do projeto a Collection do Postman, juntamente com as Environments necessárias para realizar as requisições. Para requisições protegidas, lembre-se de fazer login.

### Usuários para os testes:

- `Alex Green`: ADMIN e CLIENT
- `Maria Brown`: CLIENT

As credenciais de testes são as mesmas para ambos os usuários. Então para alternar o login entre ADMIN e CLIENT, basta mudar o valor da variável `username` da Environment, de `alex` para `maria`, ou vice-versa.

## Critérios de correção

1. Mínimo 12 commits no projeto no usuário do aluno
2. Endpoints públicos GET /produts e GET /products/{id} funcionam sem necessidade de login
3. Endpoint de login funcionando e retornando o token de acesso
4. Endpoints privados de produto (POST/PUT/DELETE) funcionam somente para usuário ADMIN
5. Endpoint GET /users/me retorna usuário logado
6. Endpoints GET /orders/{id} e POST /orders funcionando
7. Usuário que não é ADMIN não consegue acessar pedido que não é dele em GET /orders/{id}
8. Endpoint GET /categories retorna todas categorias

## Competências avaliadas

- Estruturação de projeto Spring Boot de API Rest
- Implementação de Authorization Server com password grant em projeto Spring Boot
- Implementação de Resource Server em projeto Spring Boot
- Controle de acesso por perfil de usuário em nível de rota
- Controle de acesso em nível de regra de negócio
- Realização de casos de uso