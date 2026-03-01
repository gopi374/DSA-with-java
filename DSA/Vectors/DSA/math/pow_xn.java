


public class pow_xn {
    public static void main(String[] args) {
        double x = 2;
        
        int n =-2;
        if(n<0){
            x=1/x;
            n=-n;
        }
        double ans =1;
        for(int i=0;i<n;i++){
           ans=x*ans;
        }
        System.out.println(ans);
    }
    
}
