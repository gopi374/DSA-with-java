class rotetelist{
    private  Node head;
    private int size;

    // no-argument constructor
    public rotetelist(){
        this.size = 0;
    }

    //insertion
    public void insertfirst(int value){
        Node node =new Node(value);
        node.next=head;
        head=node;
        size+=1;
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

    public static void main(String[] args) {
        rotetelist l = new rotetelist();
        l.insertfirst(5);
        l.insertfirst(4);
        l.insertfirst(3);
        l.insertfirst(2);
        l.insertfirst(1);
        l.display();
        //1 -> 2 -> 3 -> 4 -> 5 -> END
        Node temp = l.head;
        System.out.println(r(temp, 2));

    }

    public static Node r(Node head,int k){
        if(head == null || head.next==null) return head;
        Node temp = head;
        int n=0;
        Node tail=null;
        while(temp!=null){
            tail=temp;
            temp=temp.next;
            n++;
        }
        int s=n-k;
        if(s==0) return head;
        Node newtail=null;
        for(int i=0;i<s;i++){
            newtail=newtail.next;
        }

        Node newhead=newtail.next;
        tail.next=head;
        return newhead;
    }
}

