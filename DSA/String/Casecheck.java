import java.util.*;
public class Casecheck {
    public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		for(int i = 0; i < S.length(); i++){
			char s = S.charAt(i);
			sb.append(iscase(s));
		}
		System.out.println(sb.toString());
    }
	static char iscase(char a){
		if(Character.isUpperCase(a)){
			return Character.toLowerCase(a);
		}
		else{
			return Character.toUpperCase(a);
		}
	}
}
