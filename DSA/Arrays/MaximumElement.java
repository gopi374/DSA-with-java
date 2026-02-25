public class MaximumElement {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 1, 2 };
        System.out.println(maxi(nums));

    }

    static int maxi(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1; // if no majority element
    }
}
