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
        int n=mat.length,m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            int top=0,bot=m-1;
            while(top<=bot){
                int temp=mat[top][i];
                mat[top][i]=mat[bot][i];
                mat[bot][i]=temp;
                top++;
                bot--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}