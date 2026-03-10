class prefi{
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int[] ans=prefix(num);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int[] prefix(int[] nums){
        int[] ans=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}