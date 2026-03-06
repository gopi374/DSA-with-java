public class jumpgame {

    public static void main(String[] args) {
        int[] nums={5,0,2,4,9,1};
        System.err.println(jump(nums));
    }
    static boolean  jump(int[] nums){
        int size=nums.length;
        int s=nums[0];
        int n=s;
        for(int i=0;i<=n;i++){
            if(nums[i] == 0)
                return false;
        }
        return true;
    }
}