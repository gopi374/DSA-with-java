import java.util.Scanner;

public class removingDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() == 0) return;

        StringBuilder sb = new StringBuilder();
        
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }
        
        System.out.println(sb.toString());
    }
}
