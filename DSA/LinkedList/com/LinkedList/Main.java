package com.LinkedList;

public class Main {
    public static void main(String rags[]){
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(25);
        list.insertFirst(60);
        list.insertFirst(12);
        list.insertFirst(2);
        list.insertLast(100);
        list.insertMiddle(75,2);
//        list.displayHead();
//        list.displayTail();
//        list.display();
//        list.deletefirst();
//        list.deletelast();
//        list.displayHead();
//        list.displayTail();
//        list.delete(5);
//        list.display();
//        System.out.println(list.getNode(60));



        DLL dl = new DLL();
        dl.insertFirst(25);
        dl.insertFirst(24);
        dl.insertFirst(23);
        dl.insertFirst(22);
        dl.insertLast(26);
        dl.insertAfter(26,27);
//        System.out.println(dl.getNode(25));
        dl.display();
        dl.deletefirst();
        dl.deletelast();
        dl.delete(2);
        dl.display();
    }

}
