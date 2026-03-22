import java.util.Scanner;

public class evenindexcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb =new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                sb.append((char)(ch+1));
            }
            else{
                sb.append((char)(ch-1));
            }
        }
        System.out.println(sb.toString());
    }
}
