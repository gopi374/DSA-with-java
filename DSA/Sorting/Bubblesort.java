
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={0,1,2};
        bubbleSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {

        // it solves LC problem problem 75
        int n = arr.length;
        boolean swapped=false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                    
                }
            }
        }
        if(!swapped){
            System.out.println("Array is already sorted");
        }
    }
}
