import java.util.*;
class containduplicate{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,1};
        System.out.println(contains(nums));
    }
    static boolean contains(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])
                return true;
        }
        return false;

    }
}