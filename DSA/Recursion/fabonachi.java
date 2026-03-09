public class fabonachi {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fabonachi(n));
    }
    static int fabonachi(int n){
        if(n<=1){
            return n;
        }
        return fabonachi(n-1)+fabonachi(n-2);
    }
    
}
