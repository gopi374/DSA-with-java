package Tree.com;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree(){

    }

    public void populate(Scanner sc){
        System.out.print("Enter the Root Element :");
        int val = sc.nextInt();
        root=new Node(val);
        populate(sc,root);
    }

    private void populate(Scanner sc,Node node){
        
    }


    private class Node{
        private int val;
        private Node left;
        private Node right;

        public Node(int val){
            this.val=val;
        }
    }
}
