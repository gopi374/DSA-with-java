public class Function_overloading {
    public static void main(String[] args) {
        int rt = sum(1,2,5,90);
        System.out.println(rt);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c, int d){
        return a+c+b+d;
    }
}
