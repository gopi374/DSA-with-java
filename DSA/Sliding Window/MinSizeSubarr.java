class MinSizeSubarr{
    public static void main(String args[]){
        int nums[]={1,2,4,4};
        int target = 4;
        System.out.println(minsize(nums,target));
    }
    static int minsize(int nums[],int target){
        int n = nums.length;
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            // shrink window while sum >= target
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;

    }
}