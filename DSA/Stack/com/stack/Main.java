package com.stack;

public class Main {
    public static void main(String[] args) throws Exception{
//        customStack stack = new customStack();
        DynamicStack stack = new DynamicStack();
        stack.push(126);
        stack.push(127);
        stack.push(128);
        stack.push(129);
        stack.push(130);
        stack.push(10);
        stack.push(20);
        stack.push(140);
        stack.push(160);
        stack.push(180);
//        System.out.println(stack.push(520));
//        System.out.println("Top :"+stack.peek());
        stack.display();
        System.out.println(stack.search(129));
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
