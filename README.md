## 1.5 Programas com Cardápios

Um componente importante da maioria dos programas atuais são os menus. Um menu em um restaurante contém o cardápio com todos os pratos disponíveis para escolha do cliente. No caso de um programa de computador, um menu contém uma lista de opções de ações que o usuário pode efetuar em um programa.

As ferramentas que aprendemos até aqui para construção de interfaces com o usuário ainda são bastante rudimentares, porém nos possibilitam criar menus simples de opções. Para visualizarmos como trabalhar com menus, vamos a um exemplo. Considere o enunciado abaixo:

Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida.

Menu de opções:

Imposto
Novo Salário
Classificação
Finalizar o programa
Na opção 1, receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as seguintes regras:

Se o salário for menor do que R$ 1000,00, o percentual de imposto será de 5%.
Se o salário for um valor de R$ 1000,00 a R$ 3000,00, o percentual de imposto será de 10%.
Se o salário estiver acima de R$ 3000,00, o percentual de imposto será de 15%.
Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as regras a seguir.

Para salários maiores do que R$ 4500,00, o aumento será de R$ 45,00.
Para salários de R$ 2250,00 até R$ 4500,00, o aumento será de R$ 150,00.
Para salários de R$ 1350,00 até R$ 2249,99, o aumento será de R$ 225,00.
Para salário menores que R$ 1350,00, o aumento será de R$ 300,00.
Na opção 3, receber o salário de um funcionário e mostrar sua classificação usando as seguintes regras:

Para salários até R$ 1500,00 a classificação será "Mal remunerado".
Para salários maiores que R$ 1500,00 a classificação será "Bem remunerado".
O programa que precisamos construir deve exibir o menu de opções enquanto o usuário não escolher a opção de finalizar o programa. O pseudocódigo abaixo mostra um algoritmo que repete a exibição do menu de opções enquanto o usuário não finalizar o programa. 