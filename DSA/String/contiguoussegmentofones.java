import java.util.*;
class contiguoussegmentofones{
    public static void main(String[] args) {
        String s="110";
        System.out.println(checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            if((s.charAt(i)==1) || i<n && s.charAt(i+1)==1 ){
                return true;
            }
        }
        return false;
    }
}