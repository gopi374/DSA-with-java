package Tree.com;

public class BST {

    private class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int val){
            this.val=val;
        }
        public int getval(){
            return val;
        }
    }

    private Node root;

    public BST(){

    }

    public int height(Node node){
        if(node==null){
        return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int val){
        root=insert(val,root);
    }

    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    private Node insert(int val,Node node){
        if(node==null){
            node = new Node(val);
            return node;
        }
        if(val< node.val){
            node.left=insert(val,node.left);
        }

        if(val> node.val){
            node.right=insert(val,node.right);
        }

        node.height= Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }


    public void display(){
        display(this.root, "Root Node :");
    }
    public void display(Node node ,String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.val);
        display(node.left,"Left Child of "+node.val+" : ");
        display(node.right,"right Child of "+node.val+" : ");
    }
}
