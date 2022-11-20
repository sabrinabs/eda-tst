# Trim LinkedList
Escreva um programa remove os extremos de uma LinkedList. A quantidade de extremos a ser removida é passada como argumento na linha de comando.

## Entrada
Seu programa irá ler uma sequência de inteiros que devem ser adicionados (addLast) em uma LinkedList. Depois, deve ler um inteiro representando a quantidade de extremos que deve ser removida da lista.

## Saída
Na saída, seu programa deve imprimir a lista depois da remoção do nós. Se a lista for vazia, deve imprimir vazia.

Por exemplo, se for passado 1 na linha de comando, seu programa deve remover o primeiro e o último elemento. Se for passado 2, o primeiro, segundo, último e penúltimo elementos devem ser removidos e assim por diante.

## Restrições e Observações
Não é permitido usar estruturas auxiliares.
Você deve utilizar a sua implementação de LinkedList. Isto é, o seu addLast, o seu remove, o seu toString etc.
##  Exemplo de execução
    javac Solucao.java; java Solucao
    1 13 3 4 5 3 6
    1
    13 3 4 5 3


    javac Solucao.java; java Solucao
    3 3
    1
    vazia