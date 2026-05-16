public class Questions {
    public static void main(String[] args) {
        //Q=1. check the given number is even or odd , n=12;
        int n = 12;
        System.out.println(isodd(n));
    }
    private static boolean isodd(int n){
        return (n&1)==1;
    }
}
