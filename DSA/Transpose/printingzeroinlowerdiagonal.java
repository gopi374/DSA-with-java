public class printingzeroinlowerdiagonal {
    public static void main(String[] args) {
        int[][] nums={
            {1,2,3,4},
            {4,5,9,6},
            {8,5,6,30},
            {80,4,50,60}
        };
        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums.length;j++){
                if(i>j){
                    System.out.print(0+" ");
                }else{
                    System.out.print(nums[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
