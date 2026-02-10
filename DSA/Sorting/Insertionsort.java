import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr={25,3,6,79,4,55,0};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionsort(int[] arr){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            int middle=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[middle]){
                    middle=j;
                }
                int temp=arr[middle];
                arr[middle]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
