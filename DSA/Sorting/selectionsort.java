import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {3,00,-57,-15,-12,12};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        // Move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
