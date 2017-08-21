# AutoGenerator

### Gerador de Projeto Spring Boot

O sistema tem por objetivo gerar um projeto Spring boot com as pastas e classes necessárias para o desenvolvimento com base no nome do projeto e as entidades definidas para ele na hora de sua criação.

##### Configurações Geradas

Pastas:
- Pastas do Backend são geradas no formato MVC

- Pastas do Frontend são geradas no formato Specific Style

Versões:
- Spring boot na versão 1.4.2
- Java 1.8

Arquivo pom.xml:
- Gerado com a dependência JPA
- Gerado com a dependência WEB
- Gerado com a dependência Actuator
- Gerado com a dependência Thymeleaf
- Gerado com a dependência Devtools

##### Observações

- Setar as configurações do banco de dados no arquivo application.properties
- É gerado apenas as classes e anotações spring boot dentro de seus respectivos packages
- É gerado apenas arquivos básicos e pastas padrão para o desenvolvimento do frontend.

O projeto não tem como objetivo gerar o código de sua aplicação!
