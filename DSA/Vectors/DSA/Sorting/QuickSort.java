class QuickSort {
    public static void main(String[] args) {

        int arr[] = {4, 2, 7, 1};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr)
            System.out.print(num + " ");
    }
    static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];   // choose last element as pivot
        int i = low - 1;
        System.out.println(i);
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    
}
