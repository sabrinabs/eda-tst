package InvertePilhaIndex;

import java.util.Scanner;

class InvertePilhaIndex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanho = Integer.parseInt(scan.nextLine());
        String[] sequencia = scan.nextLine().split(" ");
        int indice = Integer.parseInt(scan.nextLine());

        Pilha pilha = new Pilha(tamanho);
        adicionaElementos(pilha, sequencia);
        inverte(pilha, tamanho, indice);

        imprimeSaida(pilha, tamanho);
        scan.close();
    }

    static void adicionaElementos(Pilha pilha, String[] sequencia) {
        for (int i = sequencia.length - 1; i >= 0; i--) {
            pilha.push(Integer.parseInt(sequencia[i]));
        }
    }

    static void inverte(Pilha pilha, int tamanho, int indice) {
        // crio um array auxiliar pra guardar os números que vou inverter
        int[] arrayAuxiliar = new int[tamanho - 1 - indice];
        for (int i = 0; i < arrayAuxiliar.length; i++) {
            arrayAuxiliar[i] = pilha.pop();
        }

        // crio uma pilha auxiliar pra guardar os números que vou realocar na pilha
        // principal
        Pilha pilhaAuxiliar = new Pilha(indice + 1);
        for (int i = 0; i < indice + 1; i++) {
            pilhaAuxiliar.push(pilha.pop());
        }

        // retorno os valores do array auxiliar para a pilha principal já invertidos
        for (int i = 0; i < arrayAuxiliar.length; i++) {
            pilha.push(arrayAuxiliar[i]);
            ;
        }

        // retiro os valores da pilha auxiliar para a pilha principal
        for (int i = 0; i < indice + 1; i++) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }

    static void imprimeSaida(Pilha pilha, int tamanho) {
        System.out.println("-");
        // imprimo a saida dando pop em todos os elementos da pilha, se fosse necessario
        // não modificar a pilha original, era só fazer isso em uma cópia
        for (int i = 0; i < tamanho; i++) {
            System.out.println(pilha.pop());
        }
    }
}

class Pilha {

    private int[] pilha;
    private int topo;

    Pilha(int capacidade) {

        this.pilha = new int[capacidade];
        this.topo = -1;

    }

    int[] getArray() {
        return this.pilha;
    }

    void push(int element) {
        this.topo++;
        this.pilha[topo] = element;

    }

    int pop() {
        if (isEmpty()) {
            throw new RuntimeException("EmptyStackException");
        }
        int removido = pilha[topo];
        this.topo--;
        return removido;
    }

    boolean isEmpty() {
        return this.topo == -1;
    }

    int peek() {
        if (!isEmpty()) {
            return pilha[topo];
        }

        return -1;
    }
}
