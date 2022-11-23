// essa solução utilizava uma flag para marcar uma posição que ficou vaga após a remoção de um elemento, porém
// para essa questão isso não era necessário. Dessa forma, a solução mais simples pra esse questão em específico
// está no arquivo HashSetImpl

package HashSet;

import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());
        HashSet table = new HashSet(capacity);

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

class HashSet {
    private Object[] table; 

    public HashSet(int capacity){
        this.table = new Object[capacity];
    }

    int hash(Integer key){
        return (key % this.table.length);
    }

    void put(Integer value){
        
        int sondagem = 0;
        int hash;
        if (!this.contains(value)){
            while(sondagem < this.table.length - 1){
                hash = (this.hash(value) + sondagem) % table.length;
                if (table[hash] == null || (table[hash].getDeletedFlag())){
                    table[hash] = new Object(value);
                    System.out.println(toString());
                    return;
                } 
                sondagem++;
            }
        } 
        System.out.println(toString());
        
    }

    void remove(Integer value){

        int sondagem = 0;
        int hash;
        while(sondagem < this.table.length - 1){
            hash = (this.hash(value) + sondagem) % table.length;
            if (table[hash] != null && (table[hash].getValue() == value)){
                table[hash].setDeletedFlag();
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
            if (table[hash] != null && (table[hash].getValue() == value) && !table[hash].getDeletedFlag()){
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

class Object{
    private Integer value;
    private boolean deletedFlag;

    public Object(Integer value){
        this.value = value;
        this.deletedFlag = false;
    }

    public void setDeletedFlag(){
        this.deletedFlag = !deletedFlag;
    }

    public boolean getDeletedFlag(){
        return deletedFlag;
    }

    public void setValue(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return this.value;
    }

    public String toString(){
        String out = "";
        if (!this.deletedFlag)
            out += this.value;
        else {
            out = null;
        }
        return out;
    }
}
