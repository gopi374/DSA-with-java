public class removeDuplicate {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(remov(nums));
    }
    
    static int remov(int[]nums){
        int i=0;
            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i++;
                    nums[i]=nums[j];
                }
            }
        for(int num: nums){
            System.out.print(num+" ");
        }
        return i+1;
    }
    
}
