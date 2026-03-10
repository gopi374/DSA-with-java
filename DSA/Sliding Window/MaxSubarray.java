class MaxSubarray{
    public static void main(String args[]){
        int nums[]={100,200,300,400};
        int k=2;
        System.out.println(maxsub(nums,k));
    }
    static int maxsub(int nums[], int k){
        //TC = O(n)
        //SC =O(1)
        int low=0,high=k-1;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum=sum+nums[i];
        }
        int result=0;
        while(high<nums.length){
            result=Math.max(sum,result);
            low++;
            high++;
            if(high==nums.length){
                break;
            }
            sum=sum-nums[low-1];
            sum=sum+nums[high];
        }
        
        return result;
    } 
}