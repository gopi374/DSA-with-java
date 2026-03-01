public class LC852 {
    public static void main(String[] args) {
        int[] arr={0,1,2,1,0};
        // System.out.println(peak(arr));
        System.out.println(max(arr));
        System.out.println(arr.length);
        
    }
    static int max(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static int peak(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        // Check left neighbor
        boolean leftOk = (i == 0) || (arr[i] >= arr[i - 1]);
        // Check right neighbor
        boolean rightOk = (i == arr.length - 1) || (arr[i] >= arr[i + 1]);
        
        if (leftOk && rightOk) {
            return arr[i]; // Found a peak
        }
    }
    return -1; // No peak found (shouldn't happen for non-empty array)
    }
 
}
