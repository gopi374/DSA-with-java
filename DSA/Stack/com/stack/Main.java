package com.stack;

public class Main {
    static void main(String[] args) throws Exception{
        customStack stack = new customStack(5);
        stack.push(12);
//        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        System.out.println(stack.push(52));
    stack.peek();
        stack.pop();
//        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
