import java.util.Arrays;

class Bsearch2D {
    public static void main(String[] args) {
        int[][] nums = {
            {30, 15, 23},
            {3, 6, 4},
            {2, 5, 9}
        };
        int target = 9;
        System.out.println(Arrays.toString(search(nums, target)));
    }

    static int[] search(int[][] nums, int target) {
        int r = 0;
        int c = nums.length - 1; // last column

        while (r < nums.length && c >= 0) {
            if (nums[r][c] == target) {
                return new int[]{r, c};
            }
            if (nums[r][c] < target) {
                r++; // move left
            } else {
                c--; // move down
            }
        }
        return new int[]{-1, -1};
    }
}
