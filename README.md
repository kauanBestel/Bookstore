﻿API para gerenciar uma livraria(CRUD), esta API foi desenvolvida com a finalidade de treino para relações entre tabelas de um banco de dado(N:1, N:N e 1:1)

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA

## Como Executar

- Clonar repositório git
- Construir o projeto:

```
$ ./mvnw clean package
```

- Executar a aplicação:

```
$ java -jar target/jpaaplication-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
