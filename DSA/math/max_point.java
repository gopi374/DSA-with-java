public class max_point {
    public static void main(String[] args) {
        int[][] points={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(points.length);
        System.out.println(maxPoints(points));
    }
    static  int maxPoints(int[][] points) {
        int ans=1;
        for(int i=0;i<points.length-1;i++){
            for(int j =0;j<i;j++){
                if(points[i][j]>points[i][j]+1){
                    ans = points[i][j];
                }
            }
        }
        return ans;
    }
}
