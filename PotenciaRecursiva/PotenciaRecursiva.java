package PotenciaRecursiva;

import java.util.Scanner;

class PotenciaRecursiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = Integer.parseInt(scan.nextLine()); 
        int j = Integer.parseInt(scan.nextLine()); 

        System.out.println(potencia(i,j, 1));
        scan.close();
    }

    static int potencia(int i, int j, int out) {

        if(j == 0){ return out;}
        out *= i;

        return potencia(i, j-1, out);
    }
}