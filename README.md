
# 🪙 Conversor de Moedas - Challenge Java

Aplicação de console desenvolvida em Java para realizar conversões de moedas em tempo real, consumindo dados da **ExchangeRate-API**. Este projeto foi desenvolvido como parte de um desafio de programação para consolidar conhecimentos em consumo de APIs, manipulação de JSON e lógica orientada a objetos.

---

## 🚀 Funcionalidades

O sistema oferece um menu interativo para conversões diretas entre as seguintes moedas:
- **USD** (Dólar Americano)
- **BRL** (Real Brasileiro)
- **ARS** (Peso Argentino)
- **COP** (Peso Colombiano)



## 🛠️ Tecnologias Utilizadas

* **Java 17+**: Versão utilizada para aproveitar recursos como *Records*.
* **HttpClient**: Para realizar requisições à API de forma nativa.
* **Gson (Google)**: Biblioteca para converter o retorno JSON da API em objetos Java.
* **Dotenv**: Utilizado para gerenciar a API Key de forma segura via variáveis de ambiente.
* **ExchangeRate-API**: Interface que fornece as taxas de câmbio atualizadas.

## 📁 Estrutura do Projeto

A organização segue os padrões de pacotes Java:
* `br.com.api`: Contém a classe `Main`, responsável pela execução e fluxo do programa.
* `br.com.api.conversor`: Contém a classe `ConversorDeMoeda`, que gerencia as requisições HTTP.
* `br.com.api.dto`: Utiliza **Records** para o mapeamento direto do JSON.
* `br.com.api.model`: Contém as classes de negócio, Enums e a interface do Menu.

## ⚙️ Como Configurar e Rodar

### 1. Pré-requisitos
* JDK 17 ou superior.
* Uma chave de API (gratuita) obtida em [ExchangeRate-API](https://www.exchangerate-api.com/).

### 2. Variáveis de Ambiente
Na raiz do projeto, crie um arquivo chamado `.env` e adicione sua chave:
```
KEY=seu_token_aqui 
```
### 3. Execute a aplicação
Você pode interagir através de um terminal. 