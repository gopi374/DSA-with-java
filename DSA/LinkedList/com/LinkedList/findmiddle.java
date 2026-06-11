//package com.LinkedList;
//
//class ll{
//    node head;
//    node tail;
//
//    public void insertfirst(int val){
//        node temp = new node(val);
//        temp.next=head;
//        head=temp;
//        if(tail != null){
//            tail=temp;
//        }
//    }
//    public void display(){
//        if(head==null){
//            System.out.println("null list");
//            return;
//        }
//        node temp =head;
//        while(temp !=null){
//            System.out.print(temp.val+"->");
//            temp=temp.next;
//        }
//        System.out.println("END");
//    }
//    private static class node{
//        int val;
//        node next;
//
//        node(int val){
//            this.val=val;
//        }
//    }
//}
//public class findmiddle {
//    static void main(String[] args) {
//        ll list = new ll();
//        list.insertfirst(25);
//        list.insertfirst(24);
//        list.insertfirst(23);
//        list.insertfirst(22);
//        list.insertfirst(21);
//        list.display();
//    }
//
//}

public class findmiddle {

    private Node head;
    private Node tail;
    private int size;

    // Node class
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Insert at end
    public void insertLast(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = tail = node;
            size++;
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    // Display list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // Find middle node
    public int findMiddle() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.value;
    }

    public static void main(String[] args) {
        findmiddle list = new findmiddle();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        list.display();

        System.out.println("Middle Node = " + list.findMiddle());
    }
}