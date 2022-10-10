package SelectionSortPassoAPasso;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSortPassoAPasso {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] l = scan.nextLine().split(" ");
        selectionSort(l);
        scan.close();

    }

    static void selectionSort(String[] array){

        for (int i = 0; i < array.length; i++) {
            int indexDoMenor = i;
            boolean ordenado = true;
            for (int j = i+1; j < array.length; j++) {
                if(Integer.parseInt(array[j]) < Integer.parseInt(array[indexDoMenor])){
                    indexDoMenor = j;
                    ordenado = false;
                }
            }
        
        swap(array, indexDoMenor, i);
        if (!ordenado){ System.out.println(Arrays.toString(array)); }

        }
    }

    static void swap(String[] array, int indexDoMenor, int i) {
        String aux = array[indexDoMenor];
        array[indexDoMenor] = array[i];
        array[i] = aux;
    }
}
