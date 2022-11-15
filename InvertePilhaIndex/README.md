# Inverte Pilha Index
Implemente um programa 10que, dada uma pilha como entrada, inverte os valores dessa pilha até um determinado índice também lido da entrada. Considere que o topo está no índice 0, o elemento abaixo dele no índice 1 e assim por diante.

## Restrições
Na manipulação da pilha, você só pode utilizar as operações peek, pop, push e isEmpty. É permitido utilizar estruturas auxiliares.

## Entrada
Seu programa deve ler da entrada i) o tamanho a pilha; ii) uma sequência de números a serem adicionados (push) nessa pilha (a sequência nunca é maior que o tamanho da pilha) e iii) o índice até onde a inversão deve ser feita.

Você pode assumir que o índice passado é válido.

## Saída
Seu programa deve imprimir um traço (-) e depois a pilha invertida (do topo até o índice passado).

## Exemplo de execução
    $ javac Solution.java; java Solution
    5
    1 2 4 8 24
    2
    -
    4
    8
    24
    2
    1
    $ javac Solution.java ; java Solution
    10
    8 2 1 3 0 7 2 90 12 74
    6
    -
    3
    0
    7
    2
    90
    12
    74
    1
    2
    8