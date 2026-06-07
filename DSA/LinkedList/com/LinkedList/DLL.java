package com.LinkedList;

public class DLL {

    Node head;
    int size;
    public DLL(){
        this.size=0;
    }

    //insertion
    public void insertFirst(int value){
        Node node =new Node(value);
        node.next=head;
        node.prev=null;
        if(head != null){
            head.prev=node;
        }
        head=node;
        size+=1;
    }

    //insertion last
    public void insertLast(int value){
        if(size==0){
            insertFirst(value);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node node= new Node(value,temp,null);
        temp.next=node;
        size++;
    }

    public void insertAfter(int after, int value){
        Node p = getNode(after);
        if(p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next != null){
            node.next.prev=node;
        }
        size++;
    }

    //deletefirts();
    public void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        int value =head.value;
        head.next.prev=null;
        head=head.next;
        size--;
        System.out.println("Deleted head value :"+value);
    }

    //deletelast
    public void deletelast(){
        if(size<=1){
            deletefirst();
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        int value = temp.value;
        if(temp.prev != null){
            temp.prev.next=null;
        }
        System.out.println("Deleted last value :"+value);
        size--;
    }

    //delete()
    public void delete(int idx){
        if(idx==0){
            deletefirst();
            return;
        }
        if (idx == size){
            deletelast();
            return;
        }
        Node node = get(idx-1);
        int val = node.next.value;
        node.next=node.next.next;
        size--;
        System.out.println("Deleted value :"+val);
    }
    //get() - for idx return
    public Node get(int idx){
        Node node=head;
        for(int i=0;i<idx;i++){
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

    //display method starting and reverse
    public void display(){
        Node temp=head;
        Node Last =null;
        System.out.print("START : ");
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            Last=temp;
            temp=temp.next;
        }
        System.out.println("END");

//        System.out.print("Reverse List : ");
//        while(Last!=null){
//            System.out.print(Last.value+" -> ");
//            Last=Last.prev;
//        }
//        System.out.println("START");
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
        @Override
        public String toString() {
            return "Node{value=" + value +
                    ", next=" + (next != null ? next.value : "null") +
                    "}";
        }
    }
}
