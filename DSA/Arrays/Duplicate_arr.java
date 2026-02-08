import java.util.Arrays;

public class Duplicate_arr {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(nums.length);
        // output = {1,2,3,4,5,1,2,3,4,5};
        System.out.println(Arrays.toString(ans(nums)));
    }
    static int[] answer(int[] arr){
        int n=arr.length;
        int l=arr[arr.length-1];
        for(int i=0;i<n;i++){
            if(arr[i]<l){
                swap();
            }else if(l>arr[i]){
                swap();
            }
        }
    }
    static void swap(){
        int arr=0;
        int temp=arr;
        int l;
        arr=l;
        l=temp;
    }

    static int[] ans(int[] nums) {
        int[] result = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }
}
