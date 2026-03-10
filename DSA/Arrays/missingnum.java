class missingnum{
    public static void main(String[] args) {
        int[] num={3,0,2};
        System.out.println(search(num));   
    }
    static int search(int[] nums){
        int n=nums.length;
        int Asum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        return Asum-sum;
    }
}
