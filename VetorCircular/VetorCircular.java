package VetorCircular;

import java.util.Scanner;

class VetorCircular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] test = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(vetorCircular(test, n));
        scan.close();
    }
    
    static String vetorCircular(String[] array, int quantidadeElementos){
        String out = "";
        for (int j = 0; j < quantidadeElementos; j++) {
            out += array[(j % array.length)] + " ";
        }

        return out.trim();
    }
}

