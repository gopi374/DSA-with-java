class LC121{
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
    
        int[] nums={3,1,4,2};
        System.out.println(maxProfit(prices));
        System.out.println(pattern(nums));
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
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length-1;k++){
                    if(){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}