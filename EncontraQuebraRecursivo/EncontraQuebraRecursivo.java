package EncontraQuebraRecursivo;

import java.util.Scanner;

class EncontraQuebraRecursivo{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] n = scan.nextLine().split(" ");
        System.out.println(busca(n, 1, 0));

        scan.close();
    }

    static int busca(String[] n, int indiceAtual, int indiceAnterior){

        if (indiceAtual == (n.length)){ return -1; }

        if (Integer.parseInt(n[indiceAtual]) < Integer.parseInt(n[indiceAnterior])){ return indiceAtual;}

        return busca(n, indiceAtual+1, indiceAnterior+1);
    }
}