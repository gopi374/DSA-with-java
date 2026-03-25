

public class uglynumber {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(ugly(n));
    }
    static boolean ugly(int n){
        if(n<=0) return false;
        while(n!=1){
            if(n%2==0)
                n=n/2;
            else if(n%3==0)
                n=n/3;
            else if(n%5 == 0)
                n=n/5;
            else break;
        }
        if(n==1) return true;
        else return false;
    }
}
