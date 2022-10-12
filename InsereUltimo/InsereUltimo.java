package InsereUltimo;

import java.util.Arrays;
import java.util.Scanner;

class InsereUltimo{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] array = scan.nextLine().split(" ");
        System.out.println(insereUltimo(array));

        scan.close();
    }


    static String insereUltimo(String[] array){

        for (int i = array.length-1; i > 0; i--) {
            if(Integer.parseInt(array[i]) < Integer.parseInt(array[i-1])){
                swap(array, i, i-1);
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