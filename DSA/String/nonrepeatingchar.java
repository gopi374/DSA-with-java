import java.util.*;
public class nonrepeatingchar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(find(s));
    }
    static String find(String s){
        String ans;
        for (int i = 0; i < s.length(); i++) {
            ans=s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) != s.charAt(j)){
                    
                }
            }
        }
        return "-1";
    }
}
