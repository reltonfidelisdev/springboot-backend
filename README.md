# Projeto Java Web com Spring Boot
>  Construindo uma API REST com banco de dados usando Java e Spring Boot 

## Realização
[Things Academy - Escola de programação](https://devsuperior.com.br)

[![Things Academy no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/things.academy)
[![Things Academy no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)](https://youtube.com/@things.academy)

### Pré-requisitos

- Lógica de programação (qualquer linguagem)
- Programação orientada a objetos (qualquer linguagem)
- Ferramentas
  - Spring Tool Suite (STS)
  - Postman

### Objetivos da aula

- Resgatar fundamentos de programação
- Colocar em prática esses fundamentos
- Criar um pequeno sistema com ferramentas e práticas de mercado
- Dar mais um passo em direção à preparação para o mercado

### Visão geral do sistema

Vamos construir um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/dominio.png "Modelo conceitual")

### Desenvolvimento moderno: relacional -> objeto -> json

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/objetos.png "Objetos")

### Passos da aula

- Criar o projeto
- Implementar o modelo de domínio
- Mapeamento objeto-relacional com JPA
- Configurar o banco de dados H2
- Criar os endpoints da API REST

### Trechos de código para copiar

#### Configuração do Maven Resources Plugin

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

#### Configurações do banco de dados

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### Script SQL

```sql
INSERT INTO tb_department(name) VALUES ('Human Resources');
INSERT INTO tb_department(name) VALUES ('Personal Department');
INSERT INTO tb_department(name) VALUES ('Financial');
INSERT INTO tb_department(name) VALUES ('Administrative');
INSERT INTO tb_department(name) VALUES ('Juridic');
INSERT INTO tb_department(name) VALUES ('Business Intelligence');
INSERT INTO tb_department(name) VALUES ('Information Technology');
INSERT INTO tb_department(name) VALUES ('Sales');
INSERT INTO tb_department(name) VALUES ('Client Success');
INSERT INTO tb_department(name) VALUES ('Technical Support');
INSERT INTO tb_department(name) VALUES ('NOC: Network Operations Center');

INSERT INTO tb_user(department_id, name, email) VALUES (7, 'Relton Lima', 'dev.relton@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
#### Collection Postman
https://www.postman.com/aerospace-explorer-75255150/workspace/thingsacademyjavawebspringboot/request/31276041-4f432843-f7bd-4824-8a62-61ca3bab59f4
