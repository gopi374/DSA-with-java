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

    //delete
    public void delete(int val){
        Node node = head;
        if(node==null){
            return;
        }
        if(node.value == val){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);

    }

    //dipslay()
    public void display(){
        Node node = head;
        System.out.println("Head value :"+head.value);
        System.out.println("Tail value :"+tail.value);
        if(head!=null){
            do {
                System.out.print(node.value+" -> ");
                node=node.next;
            }while (node!=tail.next &&  node!=head);
        }
        System.out.print("HEAD");
    }


    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
