package BuscaLinearRecursiva;

import java.util.Scanner;

class BuscaLinearRecursiva {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lista = scan.nextLine().split(" ");
        int num = Integer.parseInt(scan.nextLine());

        System.out.println(busca(lista, num, 0));

        scan.close();
    }

    static int busca(String[] lista, int num, int i){

        if(i >= lista.length){ return -1;}

        if(Integer.parseInt(lista[i]) == num){ return i; }

        return busca(lista, num, i+1);
    }
}
