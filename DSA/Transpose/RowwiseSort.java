import java.util.Arrays;
public class RowwiseSort {
    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 1, 2 },
                { 6, 5, 4 },
                { 9, 8, 7 }
        };
        rowwiseSort(matrix);
    }
    static void rowwiseSort(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            Arrays.sort(matrix[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
