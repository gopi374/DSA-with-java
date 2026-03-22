public class GoodString {
    public static void main(String[] args) {
        String s = "cbaeicde";
        StringBuilder sb =new StringBuilder();
        for(int i= 0;i<s.length()-1;i++){
            if(isVowel(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }
    static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
