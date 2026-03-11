import java.lang.Math;

class LC1009 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(bitwiseComplement(n));
    }
    public static int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int count=0;
        int result=0;
        while(n>0){
            int r=n%2;
            result+=((int)Math.pow(2, count) * (1 - r));
            count++;
            n=n>>1;
        }
        return result;
    }
}