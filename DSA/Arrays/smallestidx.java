class smallestidx{
    public static void main(String[] args) {
        int[] =
    }
    static int firstStableIndex(int[] nums, int k) {
        int stable = Math.min(maxi, mini);
        int i = 0;
        int maxi=0,mini=0;
        while (i < nums.length) {
            maxi = Math.max(nums[0], nums[i]);
            mini = Math.min(nums[i], nums[n - 1]);
            i++;
        }

        if (stable <= k) {
            return stable;
        }
        return -1;
    }
}