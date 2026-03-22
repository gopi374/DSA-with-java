import java.util.Scanner;

public class ispalindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(chech(s));
    }
    static boolean chech(String s){
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        if(s!=sb.toString()){
            return false;
        }
        System.out.println(sb.toString());
        return true;
    }
}
