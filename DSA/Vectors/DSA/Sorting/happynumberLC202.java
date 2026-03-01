class happynumberLC202{
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=happy(slow);
            fast=happy(happy(fast));
        }while(slow!=fast);
        return slow==1;
    }
    static int happy(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        return sum;
    }
}