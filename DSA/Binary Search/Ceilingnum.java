public class Ceilingnum {
    public static void main(String[] args) {
    //ceiling is stand for a number is greater or = to target; it follow(>=)  approch in Binary search
        int[] arr={10,15,19,50,52,85};
        int target = 19;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target){
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i]>=target){
                System.out.println("Element found at "+i);
            }
            else{
                System.out.println("not found");
            }
        }
        return 0;
    }

}
