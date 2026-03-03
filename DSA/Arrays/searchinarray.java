class searchinarray{
    public static void main(String[] args) {
        // int target = min;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==targ
        int[] nums={3,4,5,1,2};
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}