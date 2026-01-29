public class sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(sqrt(x));
    }
    static int sqrt(int x){
       int start = 1;
       int end = x;
       int ans=0;
       while(start<=end){
        int mid =start+(end-start)/2;
        if(mid<=x/mid){
            start = mid +1;
            ans = mid;
        }
        else{
            end = mid-1;
        }
       }
       return ans;
    }

}
