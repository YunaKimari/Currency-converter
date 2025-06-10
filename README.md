## Conversor de Moedas
Um conversor de moedas simples e interativo com taxas reais.

## 🎮 Sobre o projeto
Este projeto é um conversor de moedas feito em Java, executado no terminal. Ele utiliza uma API externa para obter taxas de câmbio em tempo real. O usuário pode escolher qual moeda deseja converter, em quais outras deseja
visualizar os valores, e o programa exibe a conversão de forma clara e precisa.

## 🔧 Funcionalidades
- Escolha da moeda de origem (BRL, USD, EUR, GBP).
- Conversão para até três moedas destino.
- Integração com a API da [apilayer](https://apilayer.com/marketplace/exchangerates_data-api).
- Taxas de câmbio reais e atualizadas.
- Interface via terminal com mensagens amigáveis.

## 📁 Estrutura do projeto
- ConversorDeMoedas.java: Classe principal.
- TaxasDeCambio.java: Faz a comunicação com a API externa.
- RespostaCambio.java: Classe auxiliar usada para mapear a estrutura da resposta da API.
- pom.xml: Arquivo de configuração do Maven.
- .gitignore: Arquivos/pastas ignorados pelo Git.
- README.md: Este arquivo (em português e em inglês).

## 🚀 Como executar
##### 1. Clone o repositório:
```bash
git clone https://github.com/YunaKimari/Currency-converter.git
```

##### 2. Acesse o diretório do projeto:
```
cd Currency-converter
```

##### 3. Compile e gere o .jar com dependências:
```
mvn clean package
```

##### 4. Execute o programa:
```
java -jar target/conversordemoedas-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## 📄 Licença
Este projeto está licenciado sob a Licença MIT.

## 👤 Autor
- YunaKimari (Denise Rocha)
- GitHub: github.com/YunaKimari

---

## Currency Converter
A simple and interactive currency converter using real-time exchange rates.

## 🎮 About the project
This is a command-line currency converter written in Java. It uses an external API to fetch live exchange rates. The user can choose the base currency and convert to multiple other currencies in real-time.

## 🔧 Features
- Select base currency (BRL, USD, EUR, GBP).
- Convert to up to three different currencies.
- Real-time exchange rates via apilayer.
- User-friendly terminal interface.

## 📁 Project structure
- ConversorDeMoedas.java: Main class.
- TaxasDeCambio.java: Communicates with the external API.
- RespostaCambio.java: Helper class used to map the structure of the API response.
- pom.xml: Maven build configuration.
- .gitignore: Git ignored files/folders.
- README.md: This file (in Portuguese and in English).

## 🚀 How to run
##### 1. Clone the repository:
```bash
git clone https://github.com/YunaKimari/Currency-converter.git
```

##### 2. Navigate to the project directory:
```
cd Currency-converter
```

##### 3. Build and generate the executable jar:
```
mvn clean package
```

##### 4. Run the application:
```
java -jar target/conversordemoedas-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## 📄 License
This project is licenced under the MIT License.

## 👤 Author
- YunaKimari (Denise Rocha)
- GitHub: github.com/YunaKimari
