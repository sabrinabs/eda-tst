package WarmUp;

import java.util.Scanner;

class WarmUp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = Integer.parseInt(scan.nextLine()); 
        String[] numeros = scan.nextLine().split(" ");
        

        System.out.println(multiplica(numeros, num).trim());

        scan.close();
    }

    static String multiplica(String[] numeros, int num){

        String saida = "";
        for (String string : numeros) {
            saida += Integer.parseInt(string) * num + " ";
        }

        return saida;
    }
}