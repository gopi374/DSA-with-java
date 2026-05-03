import java.util.Arrays;

class productofarray{
    public static void main(String args[]){
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productarr(nums)));
    }
    static int[] productarr(int[] nums){
        // int[] ans = new int[nums.length];
        // int p=1;
        // for(int n :nums){
        //     p*=n;
        // }
        // System.out.println(p);
        // for(int i =0;i<nums.length;i++){
        //     ans[i]=p/nums[i];
        // }
        // return ans;
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int ps=ps(nums, i);
            int ss = ss(nums, i);
            int p = ps*ss;
            ans[i]=p;
        }
        return ans;
    }
    public static int ps(int[] nums,int i){
        int p=1;
        for(int ps=0;ps<i;ps++){
            p=p*nums[ps];
        }
        return p;
    }
    public static int ss(int[] nums,int i){
        int p=1;
        for(int ss=i+1;ss<nums.length;ss++){
            p=p*nums[ss];
        }
        return p;
    }
}