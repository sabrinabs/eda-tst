import java.util.Scanner;

class BubbleSortPassoAPasso{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        bubbleSort(array);
        scan.close();
    }

    static void bubbleSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(Integer.parseInt(array[j]) > Integer.parseInt(array[j+1])){
                    swap(array, j, j+1);
                } 
            }

           System.out.println(saida(array).trim());
           if(ordenado(array)){break;}
        }
    }

    // verifica se o array ta ordenado
    static boolean ordenado(String[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(Integer.parseInt(array[i]) > Integer.parseInt(array[i+1])){
                return false;
            }
        }
        return true;
    }

    // formata a saida
    static String saida(String[] array) {
        String saida = "";
        for (String string : array) {
            saida += string + " ";
        }

        return saida;
    }

    static void swap(String[] array, int indexDoMenor, int i) {
        String aux = array[indexDoMenor];
        array[indexDoMenor] = array[i];
        array[i] = aux;
    }
}