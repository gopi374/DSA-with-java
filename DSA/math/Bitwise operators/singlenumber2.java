public class singlenumber2 {
    public static void main(String[] args) {
        int[] nums ={2,2,2,3};
        System.out.println(findSingle(nums));
    }
    static int findSingle(int[] nums){
        //brute force approach
        // int n=0;
        // int count =0;
        // for(int i=0;i<nums.length;i++){
        //     int a=nums[i];
        //     for (int j = 0; j < nums.length; j++) {
        //         if(nums[j]==a){
        //             count++;
        //         }
        //     }
        //     if(count==1) n=a;
        //     count = 0;
        // }
        // return n;

        //optimised usinh XOR operator
        int ones = 0;
        int twos=0;
        for (int i = 0; i < nums.length; i++) {
            ones=ones^nums[i] & ~twos;
            twos = twos^nums[i] & ~ones;
        }
        return ones;
    }
}
