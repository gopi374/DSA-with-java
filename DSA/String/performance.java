public class performance {
    public static void main(String[] args) {
        String s = " ";
        for(int i =0;i<26;i++){
            char a = (char)('a'+i);
            s=s+a;
        }
        System.out.println(s);
        cars(s);
    }
    //to change the caps fromat
    static  void cars(String s){
        System.out.println(s.substring(1,14).toUpperCase()+s.substring(14,25).toLowerCase());
        System.out.println();
    }
}
