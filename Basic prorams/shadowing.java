public class shadowing {
    static int x =40; // this is shadowed at 7
    public static void main(String[] args) {
        System.out.println(x);
        int x =10; 
        System.out.println(x);
        fuh();
    }
    static void fuh(){
        System.out.println(x);
    }
}
