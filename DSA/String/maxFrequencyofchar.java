import java.util.Scanner;

public class maxFrequencyofchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] count = new int[256]; 

        for (char i : s.toCharArray()) {
            count[i]++;
        }

        char maxChar = s.charAt(0);
        int maxFreq = 0;
        for (char ch : s.toCharArray()) {
            if (count[ch] > maxFreq) {
                maxFreq = count[ch];
                maxChar = ch;
            }
        }

        System.out.println(maxChar);
    }
}
