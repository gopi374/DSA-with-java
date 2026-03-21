import java.util.*;

public class sumofcol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int columnIndex = 0;

        // Compute column sums
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += mat[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                columnIndex = j + 1; // 1-based index
            }
        }

        System.out.println(columnIndex + " " + maxSum);
    }
}