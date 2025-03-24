*** 🟠 Desafio Itaú - Spring Boot API para Transações Financeiras ***
Projeto de backend desenvolvido em Java com Spring Boot, para o desafio técnico do Itaú. A API permite realizar transações financeiras e obter estatísticas resumidas dos últimos 60 segundos.
### 🚀 Tecnologias utilizadas:
- **Java 23**
- **Spring Boot 3.2+**
- **Jakarta EE**
- **Spring Web**
- **Validation API**
- **Maven (ou Gradle)** como gerenciador de dependências.


### ⚙️ Serviços e Funcionalidades:
1. **Cadastro de transação** `(POST /transacao)`
    - Recebe uma transação com valor e horário _(dataHora)_.
    - Valida se a transação não se encontra no futuro.
    - Armazena se válida.

2. **Limpeza de transações** `(DELETE /transacao)`
    - Limpa todas as transações armazenadas.

3. **Estatísticas** _(Opcional de acordo com sua implementação)_:
    - Retorna estatísticas resumidas nos últimos 60 segundos para fins analíticos _(sumário: total, média, máximo, mínimo e contagem)_.


### 🚧 Endpoints Disponíveis:

| Método HTTP |     Endpoint |           Descrição         |              Retorno esperados                  |
|     ---     |       ---    |                ---          |                         ---                     |
|  **POST**   | `/transacao` | Cria nova transação         | `201 CREATED` ou `422 UNPROCESSABLE ENTITY`     |
| **DELETE**  | `/transacao` | Limpa transações existentes | `      200 OK`                                  |




### Como rodar a Aplicação??

A aplicação pode ser rodada no ou utilizando Gradle com: ./gradlew bootRun ou com Maven: ./mvnw spring-boot:run (Eu estou usando o IntelliJ que já vem com o Maven e suas dependencias, recomendo você usar também).




Ainda pretendo implementar um sistema de controle para estatísticas (com o Java Stream API utilizada para cálculos estatísticos eficientes) e mesmo que no desafio tenha deixado explicitamente claro que não era pra utilizar um banco de dados, como eu to só brincando, irei utilizar um banco de dados persistente (Ex: PostgreSQL, MySQL, SQLite).


