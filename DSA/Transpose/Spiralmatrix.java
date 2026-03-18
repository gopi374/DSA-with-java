import java.util.*;

class Spiralmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int sr = 0, sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {

            for (int col = sc; col <= ec; col++) {
                res.add(matrix[sr][col]);
            }
            sr++;

            for (int row = sr; row <= er; row++) {
                res.add(matrix[row][ec]);
            }
            ec--;

            if (sr <= er) {
                for (int col = ec; col >= sc; col--) {
                    res.add(matrix[er][col]);
                }
                er--;
            }

            if (sc <= ec) {
                for (int row = er; row >= sr; row--) {
                    res.add(matrix[row][sc]);
                }
                sc++;
            }
        }

        return res;
    }
}