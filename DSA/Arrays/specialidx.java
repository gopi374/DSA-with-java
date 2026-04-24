public class specialidx {
    public static void main(String[] args) {
        int[] nums={1,2,1,5,4,2};
        //if i=1 
        //special i= nums[i]>nums[i-1] && nums[i]>nums[i+1]
        int n = nums.length;
        
        for(int i=1;i<n-2;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
                System.out.println(nums[i+1]);
        }
        
    }
}
