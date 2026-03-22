import java.util.Scanner;

public class palindromicsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += countPal(s, i, i);     
            count += countPal(s, i, i + 1); // even-length 
        }

        System.out.println(count);
    }

    static int countPal(String s, int left, int right) {
        int c = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            c++;
            left--;
            right++;
        }
        return c;
    }
}
