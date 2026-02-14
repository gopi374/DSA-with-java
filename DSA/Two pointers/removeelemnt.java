public class removeelemnt {
    public static void main(String[] args) {
        int[] arr={1};
        //output is 2 because after removing 3 from arr we have only 2 elements left which are 2,2
        int value=2;
        System.out.println(remove(arr, value));
        
    }
    static int remove(int[] nums,int value){
        //before removing values the length is
        int l=nums.length;
        if(l==1){
            return 0;
        }
        for(int i=0;i<l;i++){
    
            if(nums[i] == value && i<nums.length-1){
                int temp =nums[i];
                nums[i]=nums[l-1];
                nums[l-1]=temp;
                l--;
                i--; // Decrement i to recheck the current index after swapping
            }
        }
        //after remove the value , length of nums
        return l;
    }
}
