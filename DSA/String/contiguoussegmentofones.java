import java.util.*;
class contiguoussegmentofones{
    public static void main(String[] args) {
        String s="1101";
        System.out.println(checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                return false;
            }
        }
        return true;

    }
}