class singlenumber1{
    public static void main(String[] args) {
        int[] nums = {1,2,1,5,2};
        System.out.println(findSingle(nums));
    }
    static int findSingle(int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}