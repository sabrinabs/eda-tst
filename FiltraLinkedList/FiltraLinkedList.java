package FiltraLinkedList;

import java.util.Scanner;
class FiltraLinkedList {
    static LinkedList lk = new LinkedList();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        Integer num = Integer.parseInt(scan.nextLine());

        add(array);
        while (lk.contains(num)){
            lk.remove(num);
        }

        String saida = lk.toString("");
        if (saida.length() == 0){
            saida = "vazia";
        }
        System.out.println(saida);

        scan.close();
    } 
    
    static void add(String[] array){
        for (String string : array) {
            lk.addLast(Integer.parseInt(string));
        }
    }

}


class LinkedList{
    private Integer data;
    private LinkedList next;
    private LinkedList prev;

    public void addLast(Integer element){

        if (this.isEmpty()){
            if (prev == null){
                this.setPrev(new LinkedList());
            }

            this.data = element;
            this.setNext(new LinkedList());

        } else{
            this.next.addLast(element);
        }
    }

    public void remove(Integer element){

        if (!this.isEmpty()){
            if (this.data == element){
                if (this.prev.isEmpty() && this.next.isEmpty()){
                    this.data = null;
                    this.prev = null;
                    this.next = null; 
                } else {
                    this.data = this.next.getData();
                    this.next = this.next.getNext();
                    if (next != null){
                        this.next.setPrev(this);
                    }
                }
            }
            else {
                next.remove(element);
            }
        }
    }

    public boolean contains(Integer element){
        if (this.isEmpty()){
            return false;
        } else {
            if (this.data == element){
                return true;
            } else{
                return this.next.contains(element);
            }
        }
    }

    private void setNext(LinkedList node){
        this.next = node;
    }

    private void setPrev(LinkedList node){
        this.prev = node;
    }

    private Integer getData(){
        return this.data;
    }

    private LinkedList getNext(){
        return this.next;
    }

    private boolean isEmpty() {
        return this.data == null;
    }

    public String toString(String out){
        if (!this.isEmpty()){
            out += this.data + " ";  
            return this.next.toString(out);
        } 

        return out.trim();
    }

    
}

