# ✒️ Projeto Contador ✒️

## Descrição

Este projeto solicita dois números ao usuário via terminal e realiza uma verificação condicional entre eles. O sistema verifica se o segundo número é maior que o primeiro. Caso contrário, é gerada uma exceção customizada. O objetivo é praticar conceitos de **estruturas condicionais**, **estruturas de repetição** e **tratamento de exceções** em Java.

---

## 📝 Funcionalidades

- **Entrada de dados**: O usuário insere dois números inteiros pelo terminal.
- **Verificação de números**: O sistema verifica se o segundo número é maior que o primeiro.
- **Exceção customizada**: Se o primeiro número for maior que o segundo, o programa lança uma exceção customizada com uma mensagem de erro específica.
- **Contagem**: Caso a verificação seja bem-sucedida, o sistema conta do primeiro número até o segundo, exibindo cada número no terminal.

---

## Estrutura de Arquivos

- `Contador.java`: Classe principal que contém a lógica do programa e o método `main`.

---

## Requisitos

- **Java**: Versão 11 ou superior.

---

## 📝 Como Executar

1. Compile o projeto utilizando o seguinte comando:

    ```bash
    javac Contador.java
    ```

2. Execute a aplicação:

    ```bash
    java Contador
    ```

3. Insira dois números quando solicitado.

    - Se o segundo número for maior que o primeiro, o programa exibirá a contagem de forma sequencial.
    - Se o segundo número for menor ou igual ao primeiro, uma exceção customizada será lançada, informando o erro ao usuário.

---

## Exemplo de Execução

```bash
Digite o primeiro número: 3
Digite o segundo número: 8
Contagem:
3
4
5
6
7
8
