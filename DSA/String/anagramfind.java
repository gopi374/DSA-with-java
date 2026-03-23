import java.util.Arrays;
import java.util.Scanner;

public class anagramfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        for (Object elem : a) {
            System.out.println(elem+" ");
        }        
        char[] b = t.toCharArray();
        Arrays.sort(b);
        for (Object elem : b) {
            System.out.println(elem+" ");
        } 
        // System.out.println(anagram(s, t));
    }

    static boolean anagram(String s, String t) {
        if (s.length() != t.length()) 
            return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) 
            return true;
        return false;
    }
}