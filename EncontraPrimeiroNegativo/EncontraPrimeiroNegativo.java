package EncontraPrimeiroNegativo;

import java.util.Scanner;

class EncontraPrimeiroNegativo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lista = scan.nextLine().split(" ");

        System.out.println(encontraPrimeiro(lista, 0));

        scan.close();
    }


    static String encontraPrimeiro(String[] lista, int i){

        if(i >= lista.length){ return "-";}

        if(Integer.parseInt(lista[i]) < 0){ return lista[i]; }

        return encontraPrimeiro(lista, i+1);
    }
}
