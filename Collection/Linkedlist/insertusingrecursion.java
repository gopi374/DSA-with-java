
public class insertusingrecursion {
    static  class Node{
        int value;
        Node next;

        public Node(int value,Node next) {
            this.value=value;
            this.next=next;
        }
        
        public Node(int value){
            this.value=value;
        }
    }
    static Node insertAtEnd(Node head, int value) {
        if (head == null) {
            return new Node(value);
        }

        head.next = insertAtEnd(head.next, value);

        return head;
    }

    static void printList(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.value + " -> ");
        printList(head.next);
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        printList(head);
    }
}
