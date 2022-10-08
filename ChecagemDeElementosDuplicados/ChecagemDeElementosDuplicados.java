package ChecagemDeElementosDuplicados;

import java.util.Scanner;

class ChecagemDeElementosDuplicados {
    
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");
        
        System.out.println(elementosRepitidos(numbers));
        scan.close();
        
    }

    static boolean elementosRepitidos(String[] numeros) {
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[i].equals(numeros[j])){
                    return true;
                }
            }
        }
        
        return false;
    }
}
