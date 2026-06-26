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

    }
}
