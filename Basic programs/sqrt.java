import java.util.*;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        System.out.println(sqrt(n));
    }
    static double sqrt(double  n){
        double result=0;
        for(int i=1;i<=n;i++){
            if(i*i==n){ 
                result=i;
                break;
            }
            else if(i*i>n){
                result=i-1;
                break;
            }
        }
        return result;
    }
}
