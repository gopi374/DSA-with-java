
import java.util.Arrays;

public class LC34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(search(nums,target)));
    }
    static int[] search (int[] nums,int target){
        int[] arr =new int[2];
        arr[1]=arr[0]=-1;
        for(int i = 0; i<nums.length-1;i++){
            if(target == nums[i]){
                arr[0]=i;
                while(i<nums.length && nums[i+1]==target){
                    i++;
                    arr[1]=i;
                    break;
                }
            }
    }
    return arr;
    }
}
