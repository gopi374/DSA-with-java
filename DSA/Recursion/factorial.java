public class factorial {
    public static void main(String[] args) {
        int n=1342;
        // System.out.println(factorial(n));
        // funrev(n);
        System.out.println(sumofnum(n));
        System.out.println(revnum(n));
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.print(n+" ");
    }
    static int sumofnum(int n){
        if(n==0){
            return 0;
        }
        return sumofnum(n/10)+(n%10);
    }
    static int revnum(int n){
        if(n<=1){
            return 1;
        }
        n=n/10;
        return revnum(n%10);
        
    }
}
