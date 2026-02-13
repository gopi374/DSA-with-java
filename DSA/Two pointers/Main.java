// import java.util.Arrays;

// public class LC167 {
//     public static void main(String[] args) {
//         int[] arr={2,7,11,15};
//         int target =9;
//         System.out.println(Arrays.toString(find(arr, target)));

//     }   
//     static int[] find(int[] arr, int target){
//         int n=arr.length;
//         // System.out.println(n);
//         for(int i=1;i<n;i++){
//             for(int j=i+1;j<n;j++){
 
//                 if(arr[i]+arr[j] == target){
//                     return new int[]{i,j};
//                 }
//             }

//         }
//         return new int[]{-1,-1};
//     } 

// }
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(find(arr, target)));
    }

    static int[] find(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left+1, right+1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
