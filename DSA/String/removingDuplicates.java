import java.util.Scanner;

public class removingDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ls = s.toLowerCase();
        StringBuilder sb =new StringBuilder(ls);
        for (int i = 1; i <= ls.length(); i++) {
            if(ls.charAt(i-1) && ls.charAt(i)){
                sb.deleteCharAt(i-1);
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
    }
}
