import java.util.*;
class klargestarray {
    public static void main(String[] args) {
        int[] nums ={3,2,3,1,2,4,5,5,6};
        Arrays.sort(nums);
        int k=4;
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println(klar(nums,k));
    }
    static int klar(int[] nums,int k){
        Arrays.sort(nums);
        int ans=0;
        for(int i=nums.length-1;i>k;i--)
            ans=nums[i];
        return ans;
    }
}
