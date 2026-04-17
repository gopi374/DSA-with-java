class maximumaverage{
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k =4;
        System.out.println(maxi(nums,k));
    }
    static double maxi(int[] nums,int k){
        int  maxsum=0;
        int  sum=0;
        for (int i =0;i<k;i++) {
            sum+=nums[i];
        }
        maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]+nums[i-k];
            // maxsum=Math.max(maxsum, sum);
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return (double)maxsum/k;
    }
}