# Encontra "quebra" recursivo
Escreva um programa recursivo que encontra o elemento que quebra uma sequência ordenada. Seu programa deve retornar o índice desse elemento. Se não houver o elemento que quebra a sequencia, deve imprimir -1.

O elemento que "quebra" uma sequencia em ordem crescente é o que não está ordenado de acordo com os anteriores. Por exemplo, na sequência

    1 2 4 5 3 7 90
    
O elemento que quebra é o elemento 3, que está no índice 4. Perceba que a sequência é ordenada até ele e o valor 3 "quebra" essa ordenação.

Importante! Só há um elemento que quebra a sequência. Como dito anteriormente, assim que você encontrá-lo, retorne o índice desse elemento.

## Entrada
Seu programa deve ler uma sequência de inteiros separados por espaço.

## Saída
Deve imprimir o índice do elemento que quebra a sequência ou -1 se não houver esse elemento.

## Exemplo
    javac Solution.java; java Solution
    5 7 8 19 -4 67 89 99
    4

    javac Solution.java; java Solution
    5 7 8 19 67 89 99
    -1

## Funções que não são permitidas
Seu programa deve apenas manipular o array de inteiros.

    - insert
    - remove
    - pop
    - qualquer função de ordenação