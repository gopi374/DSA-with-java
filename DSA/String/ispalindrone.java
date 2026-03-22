import java.util.Scanner;

public class ispalindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String lower = s.toLowerCase();
        StringBuilder sb =new StringBuilder(lower);
        sb.reverse();
        System.out.println(sb.toString());
        System.out.println((sb.toString()).equals(lower));
    }
    
}
