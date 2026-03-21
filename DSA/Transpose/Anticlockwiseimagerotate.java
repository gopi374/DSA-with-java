import java.util.Scanner;
class Anticlockwiseimagerotate {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[c-j-1][i]=mat[i][j];
                System.out.print(res[c-j-1][i]+" ");
            }
            System.out.println();
        }
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<c;j++){
                System.out.print(res[c-j-1][i]+" ");
            }
            System.out.println();
        }
    }
}