
import javax.lang.model.util.ElementScanner14;

public class monotonicarr {
    public static void main(String[] args) {
        int[] nums={1,3,3,2};
        System.out.println(monotonic(nums));
    }
    static boolean monotonic(int[] nums){
        boolean ans =false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i<=j && nums[i]<=nums[j])
                    ans = true;
                else if(i<=j && nums[i]>=nums[j])
                    ans= true;
                else return ans=false;
            }
        }
        return ans;
    }
}
