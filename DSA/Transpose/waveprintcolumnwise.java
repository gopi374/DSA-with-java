import java.util.*;

public class waveprintcolumnwise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        // Input
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // Wave Print (column-wise)
        for(int j = 0; j < m; j++){
            if(j % 2 == 0){
                // top to bottom
                for(int i = 0; i < n; i++){
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                // bottom to top
                for(int i = n - 1; i >= 0; i--){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.print("END");
    }
}