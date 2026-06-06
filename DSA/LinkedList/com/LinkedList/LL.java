package com.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    //consturctor
    public LL(){
        this.size = 0;
    }

    //insert first method
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head = node;

        if(tail==null){
            tail =head;
        }
        size+=1;
    }

    //insert Last
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);

        tail.next = node;
        tail =node;
        size++;

    }

    //insert in middle
    public void insertMiddle(int value,int idx){
        if(idx == 0){
            insertFirst(value);
            return;
        }
        if(idx == size){
            insertLast(value);
            return;
        }
        Node temp =head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    //deletefirst
    public void deletefirst(){
        int value = head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        System.out.println("Deleted first/head value :"+value);
    }

    //deletelast
    public void deletelast(){
        int value = tail.value;
        tail=tail.next;
        if(tail==null){
            head=null;
        }
        size--;
        System.out.println("Deleted tail/last value"+tail.value);
    }

    //display head

    public void displayHead(){
        if(head == null){
            System.out.println("head is Null");
        }
        else{
            System.out.println("head value :"+head.value);
        }
    }
    //Tail display method
    public void displayTail(){
        if(tail==null){
            System.out.println("Tail is null");
        }
        else{
            System.out.println("tail value :"+tail.value);
        }
    }

    //display method
    public void display(){
        Node temp=head;
        System.out.print("Start :");
        while(temp != null){
            System.out.print(temp.value+"-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }
    }
}
