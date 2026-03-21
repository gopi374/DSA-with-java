public class lowerdaigonalcheck {
    public static void main(String[] args) {
        int[][] mat={
            {1,0,0,0},
            {1,2,0,0},
            {1,2,3,0},
            {5,5,6,3}
        };
        System.out.println(lower(mat));
    }
    static boolean lower(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat.length; j++) {
                if(mat[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
