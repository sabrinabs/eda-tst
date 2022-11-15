# Max Pilha Index
Escreva um programa que retorne o maior elemento de uma pilha considerando os valores entre o topo e o índice passado na entrada padrão.

## Entrada
Seu programa deve ler uma linha da entrada padrão representando os elementos a serem adicionados na pilha (um a um e na ordem em que chegam na entrada padrão) e um índice passado como limite para a busca.

Você só pode usar push, pop e outra estrutura auxiliar. A pilha deve manter a sua configuração inicial após a execução do seu algoritmo.

## Saída
Seu programa deve imprimir o maior elemento da pilha, considerando os valores entre o topo (índice 0) e o índice passado na entrada padrão.

## Exemplos
    javac Solution.java; java Solution
    8 2 33 4 1 5 9 21
    3
    21

    javac Solution.java; java Solution
    8 2 33 4 1 5 9 21
    5
    33

## Restrições
Você só pode usar os métodos padrões da interface de pilha (e. g. peek, push, pop, isEmpty etc) e outra estrutura auxiliar. A pilha deve manter a sua configuração inicial após a execução do seu algoritmo.

Se a sua pilha for baseada em arrays, você não pode acessar um índice arbitrário utilizando pilha[index], por exemplo. Todo o acesso deve ser feito através de pop, push e peek.