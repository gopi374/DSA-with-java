import java.util.*;
class contiguoussegmentofones{
    public static void main(String[] args) {
        String s="1101"; 
        //output = true -because segments only checks '01' if it is present in our input then return false;
        // test cases - "1000" true 
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