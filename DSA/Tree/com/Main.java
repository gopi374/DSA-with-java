package Tree.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    Scanner sc= new Scanner(System.in);
    bt.populate(sc);
    bt.prettyDisplay();


        //it is looks like --

        //      |		|----->18
        //      |----->16
        //      |		|----->17
        //      15
        //      |		|----->12
        //      |----->10
        //      |		|----->11




        //BST
        BST tree= new BST();
        tree.populate(new int[]{2,5,7,1,4,6,9,8,3,10});
        tree.inorder(new BST());
        tree.display();

    }


}
