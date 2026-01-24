public class LC34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target = 8;
        System.out.println(search(nums,target));
    }
    static int search (int[] nums,int target){
        int count=0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==target){
                count=i;
                return count=count+i;

            }
        }
        return nums[-1];
    }
}
