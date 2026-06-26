package com.stack;

public class stackusingLinkedList {

    private Node top;
    private int size;
    public stackusingLinkedList(){
        top=null;
        this.size=0;
    }

    //isEmpty
    public boolean isEmpty(){
        return top== null;
    }

    //size
    public int size(){
        return size;
    }
    //insertion method

    public void push(int val){
        Node node = new Node(val);
        node.next=top;
        top =node;
        size++;
    }

    //pop method

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty !!");
        }
        int removed = top.val;
        top=top.next;
        size--;
        return removed;
    }

    //peek method

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty !!");
        }
        return top.val;
    }

    //display

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty !!");
        }
        Node temp= top;
//        System.out.println("TOP");
        while(temp != null){
            System.out.println(temp.val);
            System.out.println("⬇️");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int val ;
        private Node next ;

        public Node(int val){
            this.val=val;
        }
    }
}
