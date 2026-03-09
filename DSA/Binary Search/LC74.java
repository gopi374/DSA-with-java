public class LC74 {
    public static void main(String[] args) {
        // 1 3 5 7 
        int[][] matrix={
            {1,3,5,7},
            {10,11,16,20},
            {20,23,36,40}
        };
        int target=41;
        System.out.println(search(matrix,target));
    }
    static boolean search(int[][] matrix,int target){
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}