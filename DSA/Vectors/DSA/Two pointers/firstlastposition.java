
import java.util.Arrays;
class firstlastposition{
    public static void main(String[] args) {
        int[] arr={0,4,3,8,0,5};
        int target = 8;
        System.out.println(Arrays.toString(fin(arr, target)));
           

    }
    static int[] fin(int[] arr, int target){
        int n=arr.length;
        for (int i=0;i<n;i++) {
            for (int j=n-1;j>=0;j--){
                if(arr[i]==target && arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}