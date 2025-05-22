# 🚀 SauceDemo - Selenium - Java

Este é um projeto de automação de testes desenvolvido utilizando **Java**, **Selenium WebDriver** e **Cucumber (BDD)**, 
com geração de relatórios no **Allure**. O objetivo deste projeto é praticar e demonstrar habilidades na criação de 
automações web, seguindo boas práticas como o padrão **Page Object Model (POM)**.

## 🛠️ Tecnologias e Ferramentas

- Java
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- Allure (relatórios)
- Maven (gerenciador de dependências)
- IDE: IntelliJ / Eclipse / VSCode (compatível)

## 🔧 Funcionalidades Automatizadas

Os cenários automatizados simulam interações no site da **SauceDemo**, contemplando:

- ✅ Login com sucesso
- ✅ Login com credenciais inválidas
- ✅ Validação de campos obrigatórios
- ✅ Adição de produtos no carrinho
- ✅ Remoção de produtos do carrinho
- ✅ Finalização de compra
- ✅ Logout do sistema

*(Cenários mapeados nos arquivos `.feature` presentes no projeto)*

## 🚀 Como executar o projeto

### ✔️ Pré-requisitos

- Java instalado (versão 11 ou superior)
- Maven instalado
- Navegador (Chrome, Firefox, Edge...)
- WebDriver (ChromeDriver, GeckoDriver...) configurado no PATH
- IDE de sua preferência (IntelliJ, Eclipse, VSCode)

### ✔️ Passos para executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/elisarezzende/AutomacaoQA.git
   
2. Acesse a pasta do projeto:
   cd SauceDemo-Selenium-Java

3. Instale as dependências:
  mvn clean install

4. Execute os testes via terminal:
   mvn test


### ✔️ Gerar relatório Allure (opcional)

Após executar os testes, gere o relatório:
  allure serve allure-results


👩‍💻 Aprendizados e Práticas
Neste projeto, foram desenvolvidas e aplicadas habilidades como:
  1. Criação de automações web com Selenium;
  2. Implementação de testes BDD utilizando Cucumber;
  3. Uso de boas práticas como o padrão Page Object Model (POM);
  4. Estruturação de testes com JUnit;
  5. Geração de relatórios com Allure;
  6. Versionamento de código com Git e GitHub


📫 Contato
LinkedIn: https://www.linkedin.com/in/ana-elisa-rezende-2907511a1/
