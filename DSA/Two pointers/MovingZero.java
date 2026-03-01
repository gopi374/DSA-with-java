public class MovingZero {
    public static void main(String[] args) {
        int[] arr={0,4,3,8,0,5};
        moveZeroesoptimal(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0 && i<n-1 && nums[i+1]!=0){
                //if we get target=0 then we will swap to end
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                
            }
        }
    }
    static void moveZeroesoptimal(int[] nums) {
    int j = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
    }
    }
    
}