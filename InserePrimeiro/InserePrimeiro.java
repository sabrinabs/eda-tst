package InserePrimeiro;

import java.util.Arrays;
import java.util.Scanner;

class InserePrimeiro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] array = scan.nextLine().split(" ");
        System.out.println(inserePrimeiro(array));

        scan.close();
    }


    static String inserePrimeiro(String[] array){

        for (int i = 0; i < array.length-1; i++) {
            if(Integer.parseInt(array[i]) > Integer.parseInt(array[i+1])){
                swap(array, i, i+1);
            }
        }

        return Arrays.toString(array);
    }


    static void swap(String[] array, int i, int j){
        String aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}