package MaxPilhaIndex;

import java.util.Scanner;

class MaxPilhaIndex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        int limite = Integer.parseInt(scan.nextLine());

        Pilha pilha = new Pilha(array.length);

        adicionaArrayNaPilha(array, pilha);
        System.out.println(achaMaior(pilha, limite + 1));

        scan.close();
    }

    static void adicionaArrayNaPilha(String[] array, Pilha pilha) {

        for (int i = 0; i < array.length; i++) {
            pilha.push(Integer.parseInt(array[i]));
        }
    }

    static int achaMaior(Pilha pilha, int index) {
        Pilha pilhaAuxiliar = new Pilha(index);
        int maior = pilha.peek();
        for (int i = 0; i < index; i++) {
            int removido = pilha.pop();
            pilhaAuxiliar.push(removido);
            if (removido > maior) {
                maior = removido;
            }
        }

        for (int i = 0; i > index; i++) {
            pilha.push(pilhaAuxiliar.pop());
        }

        return maior;
    }

}

class Pilha {

    private int[] pilha;
    private int topo;
    private int capacidade;

    Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new int[capacidade];
        this.topo = -1;

    }

    void push(int element) {
        if (!isFull()) {
            this.topo++;
            this.pilha[topo] = element;
        }
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

    boolean isFull() {
        return this.topo == capacidade - 1;
    }

    int peek() {
        if (!isEmpty()) {
            return pilha[topo];
        }

        return -1;
    }
}
