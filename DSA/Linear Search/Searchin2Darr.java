import java.util.Arrays;

public class Searchin2Darr {
    public static void main(String[] args) {
        int[][] arr = {
            {12,23,34,56},
            {67,78,89,90},
            {10,20,30,50}
       };
       int target = 50;
       System.out.println(Arrays.toString(search(arr,target)));
       System.out.println(Arrays.toString(max(arr)));
    }
    static int[] search(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    // System.out.println("Target found at index : "+ i + " , " + j);
                    return new int[] {i,j};
                }
            }
            System.out.println("\n");
        }
    return new int[]{-1,-1};
    }
    static int[] max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j<arr[i].length; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return new int[] {max};
    }
}
