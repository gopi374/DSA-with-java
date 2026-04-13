class getminimumdiff{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(getdiff(nums,3,5));
    }
    static int getdiff(int[] nums , int start ,int target){
        for(int i=0;i<nums.length;i++){
            int m=0;
            if(nums[i]==target){
                m = i-start;
            }
            for(int j=nums.length-1;j>=0;j--){
                if(nums[j]==target){
                    int l = j-start;
                    int mn=  Math.min(m,l);
                    return Math.abs(mn);
                }
                
            }
        }
        return 0;
    }
}