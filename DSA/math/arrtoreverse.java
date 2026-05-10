import java.util.Arrays;

class arrtoreverse{
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(reverse(nums)));
    }
    static int[] reverse(int[] nums){
        int n = nums.length;
        int[] ans  = new int[2*n];
        System.out.println(n);
        for(int i = 0;i<n;i++){
            ans[i]=nums[i];
        }
        int j=0;

        for(int i =2*n-1;i>=n;i--){
            ans[i]=nums[j];
            j++;
        }
        return ans;
    }
}