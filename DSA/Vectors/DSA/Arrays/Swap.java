import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i<n; i++){
            arr[i]= input.nextInt();
        }
        System.out.println("Array is :");
        run(arr);
        swap(arr);
        run(arr);
        
    }
    static void run(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr){
        Scanner input =new Scanner(System.in);
        int index;
        System.out.println("\nEnter the index you want to change: ");
        index = input.nextInt();
        System.out.println("Give the value to be replace: ");
        int value = input.nextInt();

        arr[index] = value;
        System.out.println("after swaping the array :");
    }
}