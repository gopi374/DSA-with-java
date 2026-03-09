import java.util.Arrays;

public class Transposofmatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // int r=matrix.length;
        // int c=matrix[0].length;
        // System.out.println(r+" "+c);
        // int[][] ans=new int[c][r];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         ans[j][i]=matrix[i][j];
        //         System.out.print(ans[j][i]+" ");
        //     }
        //     System.out.println();
        // }
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

           