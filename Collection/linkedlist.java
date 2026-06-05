class LL{
    private Node tail;
    private Node head;
    private int size;

    public void inserfirst(int value){
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
            inserfirst(value);
            return;
        }

        Node node =new Node(value);
        tail.next = node;
        tail=node;

        size++;
    }
    //isertmiddle

    public void insertMiddle(int value,int idx){
        if(idx==0){
            inserfirst(value);
            return;
        }
        if(idx==size){
            insertLast(value);
            return;
        }
        Node temp = head;

        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    //display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
        
    }
    //display method for tail
    public void displayTail(){
        if(tail==null){
            System.out.println("Tail is null");
        }else{
            System.out.print("Tail value :"+tail.value);
        }
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

    }

}
public class linkedlist{
    public static void main(String args[]){
        LL list = new LL();
        list.inserfirst(125);
        list.inserfirst(100);
        list.insertMiddle(99, 2);
        list.inserfirst(120);
        list.insertLast(101);
        list.display();
        list.displayTail();
    }
}