package TrimLinkedList;

import java.util.Scanner;

class TrimLinkedList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] lista = scan.nextLine().split(" ");
        int qnt = Integer.parseInt(scan.nextLine());

        adiciona(lista);
        remove(qnt);
        String saida = lk.string().trim();
        if (saida.equals("")) {
            saida = "vazia";
        }
        System.out.println(saida);

        scan.close();
    }

    static LinkedList lk = new LinkedList();

    static void adiciona(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lk.addLast(Integer.parseInt(lista[i]));
        }
    }

    static void remove(int qnt) {
        while (qnt > 0) {
            lk.removeFirst();
            lk.removeLast();
            qnt--;
        }
    }

}

class LinkedList {
    private Node head;
    private Node last;

    LinkedList() {
        this.head = new Node();
        this.last = new Node();
    }

    void addLast(Integer item) {
        Node newLast = new Node(item);
        newLast.setPrevius(this.last);
        newLast.setNext(new Node());
        this.last.setNext(newLast);
        if (this.last.isNil()) {
            this.head = newLast;
        }
        this.last = newLast;
    }

    void removeFirst() {
        if (!this.head.isNil()) {
            this.head = this.head.getNext();
            if (this.head.isNil()) {
                this.last = this.head;
            }
            this.head.setPrevius(new Node());
        }
    }

    void removeLast() {
        if (!this.last.isNil()) {
            this.last = this.last.getPrevious();
            if (last.isNil()) {
                this.head = this.last;
            }

            this.last.setNext(new Node());
        }
    }

    String string() {
        String saida = "";
        Node aux = this.head;
        while (aux.getData() != null) {
            saida += aux.getData() + " ";
            aux = aux.getNext();
        }

        return saida;
    }

    boolean isEmpty() {
        return this.head.getData() == null;
    }
}

class Node {
    private Integer data;
    private Node next;
    private Node previous;

    Node() {
    }

    Node(Integer item) {
        this.data = item;
    }

    void setData(Integer item) {
        this.data = item;
    }

    void setNext(Node node) {
        this.next = node;
    }

    void setPrevius(Node node) {
        this.previous = node;
    }

    Integer getData() {
        return this.data;
    }

    Node getNext() {
        return this.next;
    }

    Node getPrevious() {
        return this.previous;
    }

    boolean isNil() {
        return this.data == null;
    }
}