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

    //insert() using recursion
    public void insertRec(int value ,int idx){

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
        if(size<=1){
            deletelast();
        }
        Node secondlastNode=get(size-2);
        int value = tail.value;
        tail=secondlastNode;
        tail.next=null;

        System.out.println("deleted tail value :"+value);
    }

    //delete
    public void delete(int idx){
        if(idx==0){
            deletefirst();
            return;
        }
        if(idx==size-1){
            deletelast();
            return;
        }

        Node pre = get(idx-1);
        int val= pre.next.value;
        pre.next=pre.next.next;
        System.out.println("deleted value :"+val);
    }

    public void update(int val , int NewVal){
        Node node = getNode(val);
        int p = node.value;
        node.value=NewVal;
        System.out.println("Value updated-> previous="+p+" New value="+NewVal);
    }

    //Q-1,2.count,return and middle node finding
    public void countNode(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int n=count/2;
        Node node = get(n);
        System.out.println("Middle node : "+node);
        System.out.println("Total number of Nodes :"+count);
    }

    //getidx function
    public Node get(int idx){
        Node node =head;
        for (int i = 0; i < idx; i++) {
            node=node.next;
        }
        return node;
    }

    //getNode() by value
    public Node getNode(int value){
        Node node =head;
        while(node!=null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
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
    //Node creation
    private class Node{
        private int value;
        private Node next;

        @Override
        public String toString() {
            return "Node{value=" + value +
                    ", next=" + (next != null ? next.value : "null") +
                    "}";
        }

        public Node(int value){
            this.value=value;
        }

        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }
    }
}
