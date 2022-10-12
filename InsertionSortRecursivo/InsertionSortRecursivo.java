package InsertionSortRecursivo;

import java.util.Arrays;
import java.util.Scanner;

class InsertionSortRecursivo {
     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] array = scan.nextLine().split(" ");
       insertionSortRecursivo(array, 1);

        scan.close();
    }

    static String[] insertionSortRecursivo(String[] array, int i){

        int j = i;
        if (i == array.length){ return array;}
        while (j > 0 && Integer.parseInt(array[j]) < Integer.parseInt(array[j-1])){
            swap(array, j, j-1);
            j--;
        }

        System.out.println(Arrays.toString(array));
        return insertionSortRecursivo(array, i+1);
    }


    static void swap(String[] array, int i, int j){
        String aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
