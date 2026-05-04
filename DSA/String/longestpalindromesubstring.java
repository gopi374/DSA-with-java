public class longestpalindromesubstring {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));

    }

    static boolean isplindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
       return true;
    }

    static String longestPalindrome(String s) {
        int max=0,start =0,end=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isplindrome(s,i,j)==true){
                    int len = j-i+1;
                    if(len>max){
                        max=len;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,max+start);
    }
}
