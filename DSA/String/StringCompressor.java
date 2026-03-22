import java.util.Scanner;

public class StringCompressor {

    public static String compressString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
            //aaabbccsaa
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                ans.append(s.charAt(i));
                if (count > 1) {
                    ans.append(count);
                }
                count = 1; 
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(compressString(S));
        sc.close();
    }
}