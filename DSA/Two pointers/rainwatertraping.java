public class rainwatertraping {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }
    static int trap(int[] height){
        int n = height.length;
        
        // base case
        if (n <= 2) {
            return 0;
        }
 
        int water = 0;
        int[] left = new int[n-1];
        left[0] = Integer.MIN_VALUE;
 
        for (int i = 1; i < n - 1; i++) {
            left[i] = Integer.max(left[i - 1], height[i - 1]);
        }
 
        int right = Integer.MIN_VALUE;
 
        for (int i = n - 2; i >= 1; i--)
        {
            right = Integer.max(right, height[i + 1]);
 
            if (Integer.min(left[i], right) > height[i]) {
                water += Integer.min(left[i], right) - height[i];
            }
        }
 
        return water;
    }
}
