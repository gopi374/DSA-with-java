

public class rotate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7}; //output = [5,6,7,1,2,3,4]
        int k=3;
        rot(nums,k);
    }
    static void rot(int[] nums,int k){
        int n =nums.length;
        k = k % n;
        int l1 =k%n;
        System.out.println("K"+l1);
        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for(int j=n-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=last;
        }
        for(int l:nums){
            System.out.println(l+" ");
        }

    }
}
