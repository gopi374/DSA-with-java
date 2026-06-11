// package com.linklist;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.addFirst(100);
        list.addLast(10000);
        list.add(2,25);
        System.out.println(list.pop());
        list.push(85);
        System.out.println(list.get(1));
        System.out.println(list.element());
        System.out.println(list);
        System.out.println(list.reversed());

    }
}
