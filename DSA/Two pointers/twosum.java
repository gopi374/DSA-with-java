import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        // Arrays.sort(nums);
        // for(int n:nums){
        //     System.out.print(n+" ");
        // }
        System.out.println(Arrays.toString(sum(nums,target)));
    }
    static int[] sum(int[] nums,int target){
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]== target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;

        while(i<j){
            int sum=nums[i]+nums[j];

            if(sum==target){
                return new int[]{i,j};
            }
            else if(sum<target){
                i++;
            }
            else if(sum>target){
                j--;
            }
        }
    return new int[]{};
    }
}
