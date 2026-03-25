
import java.util.Vector;

public class rotate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7}; //output = [5,6,7,1,2,3,4]
        int k=3;
        rot(nums,k);
    }
    static void rot(int[] nums,int k){
        Vector<Integer> res = new Vector<>();
        int idx=0;
        for(int i=nums.length-1;i>k;i--){
           res.set(idx, nums[i]);
           idx++;
        }
        for (int i=0;i<res.size();i++) {
            System.out.print(res.get(i)+" ");
        }

    }
}
