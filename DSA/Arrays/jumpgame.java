public class jumpgame {

    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.err.println(jump(nums));
    }
    static boolean  jump(int[] nums){
        int size=nums.length;
        System.out.println(size);
        int count=0;
        int s=nums[0];
        int n=s;
        for(int i=0;i<=n;i++){
            count++;
            n=nums[i];
        }
        System.out.println(count);
        if(size==count)
            return true;
        return false;
    }
}