

class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    public void insertlast(int data){
        Node newNode= new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        
        while(lastNode.next != null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;

    }

    // Display the linked list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insertlast(20);

        System.out.println("Linked List:");
        list.display();
    }
}