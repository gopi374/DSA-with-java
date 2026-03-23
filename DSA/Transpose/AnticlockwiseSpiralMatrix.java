import java.util.*;
class AnticlockwiseSpiralMatrix{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n =sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j = 0; j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        List<Integer> res= result(mat);

        for(int i=0;i<res.size();i++){
           
            System.out.print(res.get(i)+", ");
        }
        System.out.print("END");

    }
    public static List<Integer> result(int[][] mat){
        List<Integer> res=new ArrayList<>();
        int sr=0,sc=0;
        int er=mat.length-1,ec=mat[0].length-1;
        while(sc<=ec && sr<=er){
            for(int row = sr;row<=er;row++){
                res.add(mat[row][sc]);
            }
            sc++;
            for(int col=sc;col<=ec;col++){
                res.add(mat[er][col]);
            }
            er--;
            if(sc<=ec){
                for(int row=er;row>=sr;row--){
                    res.add(mat[row][ec]);
                }
                ec--;
            }
            if(sr<=er){
                for(int col=ec;col>=sc;col--){
                    res.add(mat[sr][col]);
                }
                sr++;
            }

        }
        return res;
    }
}