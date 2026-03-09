public class prime {
    public static void main(String[] args) {
        
        int n =23;
        int[] arr= new int[n];
        System.out.println(isprime(n)); // it will only print n is prime or not
        for(int i=2;i<n;i++){
            if(isprime(i)){
                System.out.print(i+" "); // it will print those numbers are prime or less than n
            }
        }
        for(int num :arr){
            System.out.print(num+" ");
        }
    }
    static boolean isprime(int n){
        if(n<=1)
            return false;
        int c=2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}