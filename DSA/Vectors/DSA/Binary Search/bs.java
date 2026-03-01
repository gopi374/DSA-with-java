class bs {
    public static void main(String[] args) {
        int[] nums={-1,5,3,4,0};
        int target = 4;
       System.out.println(searchInsert(nums,target));
    }
    static  int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid = start + (end - start) / 2;

        while (start <= end) {

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

