public class Ceilingnum {
    public static void main(String[] args) {
    //ceiling is stand for a smallest number in array greater or = to target; it follow(>=)  approch in Binary search 
    // if target = 19 , output=50
        int[] arr={10,15,19,50,52,85};
        int target = 0;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target){
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>=target){
                return arr[i];
            }
        }
        return arr[0];
    }

}
