import java.util.*;
class contiguoussegmentofones{
    public static void main(String[] args) {
        String s="1101";
        System.out.println(checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        boolean zero=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zero=true;
            }
            else if(zero){
                return false;
            }
        }
        return true;

    }
}