public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,5,3,9,45,32,69};
        int target = 32;
        System.out.println(LS(arr,target,0));
    }
    static boolean LS(int[] arr, int target,int i){
        // if(i == arr.length){
        //     return false;
        // }
        if(arr[i]==target){
            System.out.println(i);
        }
        return LS(arr, target, i+1);
    }
}
