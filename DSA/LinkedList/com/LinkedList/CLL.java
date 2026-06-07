package com.LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    //insert()
    public void insert(int val){
        Node node = new Node(val);
        if(head==null) {
            head = node;
            tail = node;
        }
        node.next=head;
        tail.next=node;
        tail=node;
    }

    //dipslay()
    


    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
