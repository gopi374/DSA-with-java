class adddigits{
    public static void main(String[] args) {
        int n = 7584;
        int result=0;
        while(n>0){
            int rem = n%10;
            result = result + rem;
            n=n/10;
        }
        int result1=0;
        while(result>0){
            int rem = result %10;
            result1=result1+rem;
            result=result/10;
        }

        System.out.println();
    }
}