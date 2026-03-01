
public class LC125palindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(palindrome(s));       
    }
    static boolean palindrome(String s) {
        
        String ns= s.replaceAll("[^A-Za-z//d]", "");// remove the extra spaces
        String ns1 = ns.toLowerCase();//it will convert into lowercase
        String reversed = new StringBuilder(ns1).reverse().toString();//reverse of the string
        if(ns1.isEmpty()){
            return true;
        }
        if(ns1.equals(reversed)){
            return true;
        }
        else{
            return false;
        }
    }
    // static boolean palindrome(String s) {
    // // Keep only letters
    // String ns = s.replaceAll("[^A-Za-z]", "");
    
    // // Convert to lowercase
    // String ns1 = ns.toLowerCase();
    
    // // Reverse the string
    // String reversed = new StringBuilder(ns1).reverse().toString();
    
    // // Empty string is considered a palindrome
    // if (ns1.isEmpty()) {
    //     return true;
    // }
    
    // // Check equality
    // if(ns1.equals(reversed)){
    //    return true; 
    // }
    // }

}
