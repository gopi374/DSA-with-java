class LL{
    private  Node head;
    private Node tail;
    private int size;

    // no-argument constructor
    public LL(){
        this.size = 0;
    }

    //insertion
    public void insertfirst(int value){
        Node node =new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int value){
        if(tail==null){
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;

    }
    public void insertMiddle(int value,int idx){
        if(idx==0){
            insertfirst(value);
            return;
        }
        if(idx==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next=node;
        size++;
    }

    //Q=5
    public void countEnd(){
        
    }
    //display method
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    //Node creation
    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value=value;
        }   
        private Node(int value ,Node next){
            this.value=value;
            this.next=next;
        }


    }
}
public class linkedlist{
    public static void main(String args[]){
        LL list = new LL();
        list.insertfirst(14);
        list.insertfirst(55);
        list.insertLast(100);
        list.insertLast(101);
        list.insertMiddle(50, 2);
        list.display();
    }
}