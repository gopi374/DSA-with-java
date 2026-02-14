
import java.util.Arrays;

class firstlastposition{
    public static void main(String[] args) {
        int[] arr={1,4,3,8,8,5};
        int target = 0;
        System.out.println(Arrays.toString(fin(arr, target)));
    }
    static int[] fin(int[] arr, int target){
        int n=arr.length;
        for (int i=0;i<n;i++) {
            if(arr[i]==target){
                return new int[]{i};
            }
        }
        return new int[]{-1,-1};
    }
}