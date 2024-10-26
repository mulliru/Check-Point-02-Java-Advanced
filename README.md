# Projeto de Cadastro de Brinquedos - Checkpoint 2

"**Quem ouve, esquece. Quem vê, lembra. Quem faz, aprende.**"  
*Provérbio chinês*

## FIAP – Faculdade de Informática e Administração Paulista  
**Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas  
**Professor:** Dr. Marcel Stefan Wagner  
**Checkpoint 2 - Programação Spring Boot com Persistência**

**Integrantes:**  
Luna Faustino Lima, Larissa Lopes Oliveira, Lucas Alcântara Carvalho, Murillo Ferreira Ramos, Pedro Luiz Prado

### Descrição do Projeto

Este projeto tem como objetivo desenvolver uma aplicação de cadastro e consulta de brinquedos para uma empresa de produtos infantis, voltada para crianças de até 12 anos. O projeto utiliza o framework Spring Boot, com a configuração do tipo Maven, em linguagem Java, e realiza a persistência de dados em um banco de dados Oracle.

### Funcionalidades

- **Create (POST)**: Permite o cadastro de brinquedos no sistema.
- **Read (GET)**: Realiza consultas de brinquedos já cadastrados.

A aplicação permite realizar testes Web via endpoints HTTP utilizando o software **Postman**. As operações CRUD básicas estão parcialmente implementadas, com foco em **Create** e **Read**.

### Configuração do Banco de Dados

O projeto utiliza um banco de dados Oracle, e a conexão é feita por meio do arquivo `application.properties` do Spring Boot. As seguintes informações são armazenadas na tabela de brinquedos:

- **Id**: Identificação única do brinquedo.
- **Nome**: Nome do brinquedo.
- **Tipo**: Tipo do brinquedo (Ex: Eletrônico, Educativo).
- **Classificação**: Faixa etária recomendada.
- **Tamanho**: Dimensões do brinquedo.
- **Preço**: Preço do brinquedo.

### Exemplo de JSON para Cadastro (POST)

Ao realizar uma requisição **POST** para cadastrar um brinquedo, use o seguinte formato de JSON no **Postman**:

```json
{
  "nome": "Carrinho de Controle Remoto",
  "tipo": "Eletrônico",
  "classificacao": "Acima de 5 anos",
  "tamanho": "30 cm",
  "preco": 120.00
}
```

### Prints do POSTMAN

![image](https://github.com/user-attachments/assets/fcb3bb56-de5a-4028-a45a-c618270ca054)
![image](https://github.com/user-attachments/assets/e8d097bc-0b30-48f8-8dc0-260025cfca63)
