package TrocaVizinhos;

import java.util.Arrays;
import java.util.Scanner;

class TrocaVizinhos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        troca_vizinhos(array);
        System.out.println(Arrays.toString(array));

        scan.close();
        }

    static void troca_vizinhos(String[] v){
        String aux = "";
        for (int i = 0, j = 1; j < v.length; i+=2, j+=2) {
            aux = v[i];
            v[i] = v[j];
            v[j] = aux;
        }       
    }
}
