class getminimumdiff{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(getdiff(nums,3,5));
    }
    static int getdiff(int[] nums , int start ,int target){
        for(int i=0;i<nums.length;i++){
            int min=0;
            for(int j=nums.length-1;j>=0;j--){
                if(nums[j]==target){
                    return Math.min(min,j-start);
                }
            }
        }
        return 0;
    }
}