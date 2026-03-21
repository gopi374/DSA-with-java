import java.util.*;

public class wordextractfromstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getWords(s);
    }

    static void getWords(String s) {
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                if (word.length() > 0) {
                    System.out.println(word.toString());
                }
                word = new StringBuilder(); 
            }
            word.append(ch);
        }

        if (word.length() > 0) {
            System.out.println(word.toString());
        }
    }
}