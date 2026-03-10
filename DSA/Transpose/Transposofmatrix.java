import java.util.Arrays;

public class Transposofmatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {110,20,38},
            {42,50,46},
            {7,8,9}
        };
        int r=matrix.length;
        int c=matrix[0].length;
        // System.out.println(r+" "+c);
        // int[][] ans=new int[c][r];
        Arrays.sort(matrix[0]);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(transpose(matrix)));
    }
    static int[][] transpose(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] ans=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}

           