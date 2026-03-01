class pivotindex{
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(val(nums));
       
    }
    static int val(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int ls=0,rs=sum;
        for(int i=0;i<nums.length;i++){
            rs=rs-nums[i];
            if(ls==rs){
                return i;
            }
            ls=ls+nums[i];
        }
        return -1;
    }
}