import java.util.*;
public class diifernecrbetweenadjacentcharacters {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S =sc.nextLine();
		System.out.println(fin(S));
    }
	static String fin(String s){
		StringBuilder ans = new StringBuilder();
		ans.append(s.charAt(0));
		for(int i =1 ; i<s.length();i++){
			int diff = s.charAt(i)-s.charAt(i-1);
			ans.append(diff);
			ans.append(s.charAt(i));
		}
		return ans.toString();
	}
}
