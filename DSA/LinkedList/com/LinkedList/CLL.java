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
    public void display(){
        Node node = head;
        System.out.print("START : ");
        if(head!=null){
            do {
                System.out.print(node.value+" -> ");
                node=node.next;
            }while (node!=head);
        }
        System.out.print("END");
    }


    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
