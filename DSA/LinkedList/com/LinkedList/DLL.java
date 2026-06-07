package com.LinkedList;

public class DLL {

    Node head;


    //insertion
    public void insertFirst(int value){
        Node node =new Node(value);
        node.next=head;
        node.prev=null;
        if(head != null){
            head.prev=node;
        }
        head=node;
    }

    //insertion last

    public void insertLast(int value){

    }

    //get() node
    public Node get(){
        
    }

    //display method
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
