public class LC852 {
    public static void main(String[] args) {
        int[] arr={0,1,2,1,0};
        System.out.println(peak(arr));
        
    }
    // static int peak(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         boolean leftok = (i == 0) || (arr[i]>=arr[i-1]);
    //         boolean rightok = (i == arr.length-1) || (arr[i]>=arr[i+1]);
    //         if(leftok && rightok){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }
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
