import java.util.*;

class AnticlockwiseSpiralMatrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] matrix = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        List<Integer> res=new ArrayList<>();
        res=AnticlockwiseSpiral(matrix);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + ", ");
        }
        System.out.print("END");
    }

    public static List<Integer> AnticlockwiseSpiral(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int sr = 0, sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            for (int row = sr; row <= er; row++) {
                res.add(matrix[row][sc]);
            }
            sc++;
            for (int col = sc; col <= ec; col++) {
                res.add(matrix[er][col]);
            }
            er--;
            if (sc <= ec) {
                for (int row = er; row >= sr; row--) {
                    res.add(matrix[row][ec]);
                }
                ec--;
            }   
            if (sr <= er) {
                for (int col = ec; col >= sc; col--) {
                    res.add(matrix[sr][col]);
                }
                sr++;
            }
        }

        return res;
    }
}