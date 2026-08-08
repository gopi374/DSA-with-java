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
        System.out.println("Do you want to insert in left to the :"+node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the Value of left of :"+node.val);
            int val = sc.nextInt();
            node.left=new Node(val);
            populate(sc,node.left);
        }

        System.out.println("Do you want to insert in Right to the :"+node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the Value of right of :"+node.val);
            int val = sc.nextInt();
            node.right=new Node(val);
            populate(sc,node.right);
        }
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node , int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level != 0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.val);
        }else {
            System.out.println(node.val);
        }

        prettyDisplay(node.left,level+1);
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
