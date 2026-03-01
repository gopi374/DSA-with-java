public class Armstrong {
    public static void main(String[] args) {
        int a = 153;
        int ans = 0;
        while(a>0){
            //Armstrong numbers
            int remind = a%10;
            ans = ans + remind *remind *remind;
            ans += remind;
            a=a/10;
        }
        System.out.println(ans);
    }
}
