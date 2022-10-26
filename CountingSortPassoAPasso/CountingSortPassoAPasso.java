import java.util.Scanner;

class CountingSortPassoAPasso{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] entrada = scan.nextLine().split(" ");
        int[] array = converte(entrada);
        int maior = Integer.parseInt(scan.nextLine());
        countingSort(array, maior);

        scan.close();
    }

    static int[] countingSort(int[] a, int h){

        int[] c = new int[h + 1];

        // frequencia
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
            System.out.println(formataSaida(c));
        }

        // comulativa
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }
        System.out.println("Cumulativa do vetor de contagem - " + formataSaida(c));

        //locacao
        int[] b = new int[a.length];
        for (int j = a.length - 1; j >= 0; j--){
            b[c[a[j]]-1] = a[j];
            c[a[j]]--;
        }

        System.out.println(formataSaida(c));
        System.out.println(formataSaida(b));

        return b;
    }


    static int[] converte(String[] array){
        int[] saida = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            saida[i] = Integer.parseInt(array[i]);
        }

        return saida;
    }

    static String formataSaida(int[] array){
        String saida = "";

        for (int i = 0; i < array.length; i++) {
            saida += array[i] + " ";
        }

        return saida.trim();
    }
}