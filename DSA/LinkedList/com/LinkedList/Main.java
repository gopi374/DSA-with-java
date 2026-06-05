package com.LinkedList;

import org.w3c.dom.Node;

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
        list.displayTail();
        list.display();
    }

}
