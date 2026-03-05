# Sistema de Orçamento Automotivo 🚗

Um sistema backend desenvolvido para o gerenciamento e geração de orçamentos em oficinas automotivas. A aplicação permite registrar serviços (como pintura e polimento), aplicação de descontos, peças utilizadas e prazos, preparando o terreno para a vinculação com clientes e veículos.

O projeto foca em boas práticas de Engenharia de Software, incluindo o uso de injeção de dependências, mapeamento objeto-relacional (ORM) e segurança de credenciais de banco de dados através de perfis de ambiente.

## Funcionalidades Atuais

* **Criação de Orçamentos:** Endpoint REST para recebimento e persistência de dados do orçamento.
* **Auditoria Automática:** Registro automático da data e hora exata da criação do orçamento via Service.
* **Segurança de Dados:** Separação de credenciais sensíveis usando o padrão de profiles do Spring Boot (`application-dev.properties` ignorado no versionamento).
* **Mapeamento de Entidades:** Estrutura relacional preparada para `Cliente`, `Carro` e `Orcamento`.

## 💻 Tecnologias e Ferramentas

* **Linguagem:** Java
* **Framework:** Spring Boot (Web, Data JPA)
* **Banco de Dados:** MySQL
* **Ferramentas Adicionais:** Lombok, Maven
* **Testes de API:** Arquivos `.http` integrados à IDE.

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
* Java JDK instalado.
* MySQL Server rodando localmente (porta 3306).
* Uma IDE como IntelliJ IDEA ou Eclipse.

### Passos para rodar:

1. Clone o repositório:
```bash
   git clone https://github.com/ph-ferreiraS/Orcamento-PDF.git

```

2. Crie o banco de dados no MySQL:
```sql
CREATE DATABASE sistema_orcamento;
```


3. **Configuração de Segurança:** O projeto utiliza um perfil de desenvolvimento seguro. Na pasta `src/main/resources`, crie um arquivo chamado `application-dev.properties` e adicione a sua senha do MySQL:
```properties
spring.datasource.password=sua_senha_real_aqui

```


*(Nota: Este arquivo já está mapeado no `.gitignore` para sua segurança).*
4. Execute a classe principal `OrcamentoAutomotivoApplication.java` na sua IDE. O Spring Boot criará as tabelas automaticamente (DDL Auto).

## 📡 Endpoints da API

### Criar Novo Orçamento

* **Rota:** `POST /api/orcamentos`
* **Corpo da Requisição (JSON):**

```json
{
  "completo": true,
  "polimento": false,
  "pintura": true,
  "desconto": true,
  "prazo": 5,
  "descricao": "Pintura completa do para-lama esquerdo",
  "pecas": "Tinta metálica, Verniz",
  "preco": 1250.50
}

```
*Desenvolvido como projeto de estudo e portfólio em Sistemas de Informação.*
