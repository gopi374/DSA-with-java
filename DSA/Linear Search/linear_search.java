import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n= in.nextInt();
        int[] arr = new int[n]; //int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i = 0; i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter target : ");
        int target = in.nextInt();
        Lsearch(arr,target);
       
    }
    static boolean Lsearch(int[] arr,int target){
        if(arr.length == 0){
            System.out.println("Array is empty");
            return false;
        }

        //for loop
        for(int index = 0;index <arr.length;index++){
            int element = arr[index];
            if(element == target){
                System.out.println("Element found at index : "+ index);
                return true;
            }
        }
        return false;
    }
    static void max(int[] arr, int start, int end){
        start = 0;
        end = arr.length;
        while(start>end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr , int index1 ,int index2){
        int temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
    }
}
