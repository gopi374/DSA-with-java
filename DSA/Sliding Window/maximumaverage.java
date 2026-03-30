class maximumaverage{
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k =4;
        System.out.println(maxi(nums,k));
    }
    static double maxi(int[] nums,int k){
        double maxsum=0;
        for (int i =0;i<nums.length;i++) {
            for(int j=i;j<k;j++){
                maxsum=maxsum+nums[j];
                // System.out.print(maxsum+" ");
            }
            System.out.println(maxsum/k);
        }
        return maxsum;
    }
}