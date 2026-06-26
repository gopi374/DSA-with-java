
public class QueueusingLinkedList{
    private class Node{
        private int val ;
        private Node next ;

        public Node(int val){
            this.val=val;
        }
    }

    private Node front;
    private Node end;
 
    public QueueusingLinkedList(){
        front=null;
        end=null;
    }

    //isEmpty
    public boolean isEmpty(){
        return front== null;
    }

    //add
    public void add(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            front = end = node;
        } else {
            end.next = node;
            end = node;
        }

    }

    //remove
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty !!");
        }
        int removed=front.val;
        front=front.next;
        if(front == null){
            end=null;
        }

        return removed;
    }

    //front
    public int getFront() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty !!");
        }
        return front.val;
    }

    //display
    public void display() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty !!");
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.val+" <- ");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) throws Exception{
        QueueusingLinkedList ql = new QueueusingLinkedList();
        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.add(4);
        ql.add(5);
        ql.add(6);
        ql.add(7);
        ql.display();
        System.out.println("Removed val :"+ql.remove());
        System.out.println("Is queue Empty ? :"+ql.isEmpty());
        System.out.println("Front val :"+ql.getFront());
        ql.display();

        //         it is looks like --
        //
        //          front
        //            |
        //            v
        //          +---+     +---+     +---+
        //          | 1 | --> | 2 | --> | 3 | --> null
        //          +---+     +---+     +---+
        //                                  ^
        //                                  |
        //                                 end
    }
}
