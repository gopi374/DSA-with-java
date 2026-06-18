package com.stack;

import static javax.swing.GroupLayout.DEFAULT_SIZE;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 0;

    int ptr = -1;

    public  customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        this.data=new int[size];
    }

    public  boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full ");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("cannot remove item");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot get peek element");
        }
        return data[ptr];
    }
    public boolean isFull(){
            return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
