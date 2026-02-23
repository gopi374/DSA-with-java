class LC121{
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
    
        int[] nums={3,1,4,2};
        System.out.println(min(nums));
        System.out.println(maxProfit(prices));
        System.out.println(pattern(nums));
    }
    static int min(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update the maximum profit
            }
        }
        
        return maxProfit;
    }
    static boolean pattern(int[] nums){
        //output: true
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[k] && nums[k]<nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}