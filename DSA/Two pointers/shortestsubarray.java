import java.util.Arrays;
class shortestsubarray{
    public static void main(String[] args) {
        int[] nums={2,6,4,8,10,9,15};
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        int n=nums.length;
        int s=-1,e=-1;
        // while(j<n){
        //     if(nums[i]<nums[j]){
        //         j++;
        //         i++;
        //     }
        //     else{
        //         length++;
        //     }
        // }
        for(int i=0;i<n;i++){
            if(nums[i]!=sorted[i]){
                if(s==-1){
                    s++;
                }
                else{
                    e++;
                }
            }
        }
        if(s==-1){
            System.out.println(0);
        }

        System.out.println(e-s+1);
    }
}