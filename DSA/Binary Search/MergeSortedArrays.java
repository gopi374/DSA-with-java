public class MergeSortedArrays {

    static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // compare elements and merge
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // remaining elements of first array
        while (i < a.length) {
            result[k++] = a[i++];
        }

        // remaining elements of second array
        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] merged = merge(arr1, arr2);

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
