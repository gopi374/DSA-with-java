import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        // fun(1,2,2,5,5,2,93,10); // ... variable arguments are used to pass multiple arguments to a method . in this length is not fixed
        // fun(4,5,4,9);

        fun('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y', 'Z');
        multiple(1,2,"Gopi","is","a","good","boy" );
    }
    static void fun(char ...a){
        System.out.println(Arrays.toString(a));
    }
    static void multiple(int a, int b , String ...v){ // varialbe arguments should be at last
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
