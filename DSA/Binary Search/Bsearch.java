public class Bsearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        if (check(arr)) {
            System.out.println(Bsearch(arr, target));
        } else {
            System.out.println("Array is not sorted. Binary search not possible.");
        }

        // Recursive Binary Search
        System.out.println(recursiveBsearch(arr, target, 0, arr.length - 1));

    }

    static int Bsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int recursiveBsearch(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target>arr[mid]){
            return recursiveBsearch(arr,target,mid+1,end);
        }
        else if(target<arr[mid]){
            return recursiveBsearch(arr,target,start,mid-1);
        }
        else{
            return mid;
        }
    }

    static boolean check(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
