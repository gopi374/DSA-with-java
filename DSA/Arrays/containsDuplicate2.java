class containsDuplicate2{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k=2;
        System.out.println(find(nums,k));
    }
    static boolean find(int[] nums, int k){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
