# Desafio de código Controle Fluxo DIO

# Contador Java

Este é um programa Java simples que permite ao usuário inserir dois parâmetros inteiros e, em seguida, gera uma contagem de números a partir do primeiro parâmetro até o segundo. O programa também lida com exceções quando o segundo parâmetro não é maior que o primeiro.

## Funcionalidades

1. O programa solicita ao usuário que insira dois parâmetros inteiros (parametroUm e parametroDois).
2. Ele verifica se parametroDois é maior que parametroUm.
3. Se parametroDois for maior que parametroUm, o programa gera uma contagem de números a partir de parametroUm até parametroDois.
4. Se parametroDois não for maior que parametroUm, ele lança uma exceção personalizada chamada `ParametrosInvalidosException` e imprime a mensagem "O segundo parâmetro deve ser maior que o primeiro".

## Estrutura do Código

O código está dividido em duas classes principais:

1. `Contador`: Contém o método `main` onde a entrada do usuário é lida e o método `contar` que lida com a lógica de contagem e a exceção personalizada.

2. `ParametrosInvalidosException`: Uma classe personalizada que estende a classe `Exception`, usada para representar a exceção quando os parâmetros são inválidos.

## Testes

O arquivo `ContadorTest.java` contém testes simples para verificar a funcionalidade do programa. Eles incluem casos de parâmetros válidos e inválidos. Você pode executar esses testes separadamente para garantir que o programa esteja funcionando corretamente.

## Contribuições

Sinta-se à vontade para contribuir com melhorias ou correções neste projeto. Basta abrir uma issue ou enviar uma solicitação de pull request.

## Autor

Este projeto foi criado por [Aranjhonn].