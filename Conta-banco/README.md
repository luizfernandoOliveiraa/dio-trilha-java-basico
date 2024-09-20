# 💻 Aplicação de Conta Bancária - ContaTerminal 💻

## Descrição

Este projeto é uma aplicação em Java que simula a criação de uma conta bancária. O programa solicita informações básicas do usuário, como nome do titular, número da agência, número da conta e saldo inicial. Após a coleta dos dados, exibe uma mensagem de boas-vindas com as informações fornecidas.

---

## 📝 Funcionalidades

- **Entrada de dados via terminal**: 
  - Nome do titular da conta
  - Número da agência
  - Número da conta
  - Saldo inicial
- **Mensagem de confirmação**: Após a entrada dos dados, o programa exibe uma mensagem de boas-vindas confirmando os detalhes fornecidos e informando que o saldo está disponível para saque.

---

## 📋 Estrutura de Arquivos

- `ContaTerminal.java`: Arquivo principal que contém toda a lógica do programa, desde a coleta de dados até a exibição da mensagem.

---

## 📋 Requisitos

- **Java**: Versão 11 ou superior.

---

## 📝 Como Executar

1. Compile o projeto utilizando o seguinte comando:

    ```bash
    javac ContaTerminal.java
    ```

2. Execute a aplicação:

    ```bash
    java ContaTerminal
    ```

3. Insira os dados solicitados no terminal:
    - Nome do titular
    - Número da agência
    - Número da conta
    - Saldo inicial

4. O programa exibirá uma mensagem confirmando as informações da conta.

---

## Exemplo de Execução

```bash
Seja Bem Vindo!
Me forneça as seguintes informações sobre a sua conta:
Qual é o seu nome? 
João Silva
Insira sua agência: 
001
Insira sua conta: 
123456
Insira seu saldo: 
1500.00

Olá João Silva, obrigado por criar uma conta em nosso banco, sua agência é 001, conta 123456 e seu saldo de 1500.0 já está disponível para saque.
