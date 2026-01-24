public class DescBsearch {
    public static void main(String[] args) {
        int[] arr={200,125,96,86,76,50,40};
        int target=96;
        System.out.println(descBsearch(arr,target));
        System.out.println(recursiveBsearch(arr, target, 0, arr.length-1));
        
    }
    static int descBsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
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
}
