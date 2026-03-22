import java.util.Scanner;

public class ispalindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb =new StringBuilder(s);
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            sb.append(iscase(ch));
        }
        sb.reverse();
        System.out.println((sb.toString()).equals(s));
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
