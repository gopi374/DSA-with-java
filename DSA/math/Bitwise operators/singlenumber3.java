public class singlenumber3 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,5,3};
        System.out.println(findSingle(nums));
    }
    static int[] findSingle(int[] nums){
        int count = 0;
        int[] ans = new int[count];

        int x=0 ,y =0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i] ^ nums[j]!=0){
                    ans[count]=nums[i];
                }
            }
        }
        return ans;
    }
}
