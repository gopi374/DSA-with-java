package com.stack;

public class Main {
    public static void main(String[] args) throws Exception{
        customStack stack = new customStack(5);
        stack.push(126);
        stack.push(127);
        stack.push(128);
        stack.push(129);
        stack.push(130);
//        System.out.println(stack.push(520));
//        System.out.println("Top :"+stack.peek());
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
