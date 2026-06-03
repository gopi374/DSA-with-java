class Main {
    public static void main(String[] args) {
        Node node1 =new Node();
        Node node2=new Node();
        node2.value=2;
        node2.next=null;
        node1.value= 1;
        node1.next= node2;

    }
}
class Node{
    public int value;

    public Node next; //it is used as reference to next node
}

