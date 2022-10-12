package MarianaEOsLivros;

import java.util.Scanner;

class MarianaEOsLivros {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] array = scan.nextLine().split(",");
       ordenaLivros(array);

        scan.close();
    }
    

    static void ordenaLivros(String[] array){

        for (int i = 0; i < array.length; i++) {
            
            int j = i;
            while (j > 0 && (array[j].compareTo(array[j-1])) < 0){
                swap(array, j, j-1);
                j--;
            }

            System.out.println(formataSaida(array));
        }
    }
    

    static String formataSaida(String[] array) {
        String saida = "";
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1){
               saida += array[i] + ", "; 
            }else{
                saida += array[i];
            }
        }

        return saida;
    }


    static void swap(String[] array, int i, int j){
        String aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
