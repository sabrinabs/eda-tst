package HashSet;

import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());
        HashSetImpl table = new HashSetImpl(capacity);

        Integer value;
		String entrada[];
		String operacao = "";

		while (!operacao.equals("end")) {
			entrada = scan.nextLine().split(" ");
			operacao = entrada[0];

			switch (operacao) {
			case "put":
				value = Integer.parseInt(entrada[1]);
				table.put(value);
				break;

			case "remove":
				value = Integer.parseInt(entrada[1]);
				table.remove(value);
				break;

			case "contains":
				value = Integer.parseInt(entrada[1]);
				System.out.println(table.contains(value));
				break;
			}

		}
		scan.close();
    }
}

class HashSetImpl {
    private Integer[] table; 

    public HashSetImpl(int capacity){
        this.table = new Integer[capacity];
    }

    int hash(Integer key){
        return (key % this.table.length);
    }

    void put(Integer value){
        
        int sondagem = 0;
        int hash;

        while(sondagem < this.table.length - 1){
            hash = (this.hash(value) + sondagem) % table.length;
            if (table[hash] == null || table[hash] == value){
                table[hash] = value;
                System.out.println(toString());
                return;
            } 
            sondagem++;
        }
         
        System.out.println(toString());
        
    }

    void remove(Integer value){

        int sondagem = 0;
        int hash;
        while(sondagem < this.table.length - 1){
            hash = (this.hash(value) + sondagem) % table.length;
            if (table[hash] == value){
                table[hash] = null;
                System.out.println(toString());
                return;
            }
            sondagem++;
        }
        
        System.out.println(toString());
    }

    boolean contains(Integer value){
       
        int sondagem = 0;
        int hash;
        while(sondagem < this.table.length - 1){
            hash = (this.hash(value) + sondagem) % table.length;
            if (table[hash] == value){
                return true;
            }
            sondagem++;
        }

        return false;
    }

    public String toString(){
        return Arrays.toString(table);
    }
}