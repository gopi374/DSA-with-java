import java.util.Scanner;

public class ispalindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb =new StringBuilder(s);
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            ch.toLowerCase();
        }
        sb.reverse();
        System.out.println((sb.toString()).equals(s));
    }
}
