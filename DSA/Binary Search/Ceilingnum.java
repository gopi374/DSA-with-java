public class Ceilingnum {
    public static void main(String[] args) {
    //ceiling is stand for a smallest number in array greater or = to target; it follow(>=)  approch in Binary search 
    // if target = 19 , output=50
        int[] arr={10,15,19,50,52,85};
        int target = 85;
        System.out.println(Bsearch(arr, target));
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target){
        if(target>arr.length-1){
            return -1;
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>=target){
                return arr[i];
            }
        }
        return arr[0];
    }
    static int Bsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target>arr.length-1){
            return -1;
        }
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
        return start;
    }

}
