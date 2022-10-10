package SelectionSortRecursivo;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSortRecursivo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] Array = scan.nextLine().split(" ");
        selectionSort(Array, 0);
        scan.close();
    }

    static String[] selectionSort(String[] array, int i){

        if (i == array.length - 1){return array;}

        int indexDoMenor = i;
        for (int j = i+1; j < array.length; j++) {
            if(Integer.parseInt(array[j]) < Integer.parseInt(array[indexDoMenor])){
                indexDoMenor = j;
            }
        }

        swap(array, i, indexDoMenor);
        System.out.println(Arrays.toString(array));

        return selectionSort(array, i + 1);
    }

    static void swap(String[] array, int indexDoMenor, int i) {
        String aux = array[indexDoMenor];
        array[indexDoMenor] = array[i];
        array[i] = aux;
    }
}
