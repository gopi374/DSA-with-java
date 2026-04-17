public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,5,3,9,45,32,69};
        int target = 32;
        System.out.println(LS(arr,target,0));
        System.out.println(LSint(arr, target, 0));
    }
    static boolean LS(int[] arr, int target,int i){
        // if(i == arr.length){
        //     return false;
        // }
        if(arr[i]==target){
            return true;
        }
        return arr[i]==target || LS(arr, target, i+1);
    }
    static int LSint(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else{
           return LSint(arr, target, i+1);
        }
        
    }
}
