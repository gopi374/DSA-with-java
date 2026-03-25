import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf=0;
        int min = Integer.min(a,b); 
        for(int i=min;i>=0;i--){
            if(a%i==0 && b%i==0){
                hcf=i;
                break;
            };
        }
        System.out.print("GCD = "+hcf);
    }
}
