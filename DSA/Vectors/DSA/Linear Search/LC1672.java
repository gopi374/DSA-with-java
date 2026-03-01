public class LC1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,1}
        };
        //output = 6(1+2+3)
        System.out.println(wealth(accounts));
    }
    static int wealth(int[][] accounts){
        int count=0;
        int n=accounts.length;
        for(int i = 0; i<n;i++){
            for(int j=0;j<accounts[i].length;j++){
                accounts[i][0]=accounts[i][0]+accounts[i][j];
            }
            if(accounts[i][0]>count){
                count=accounts[i][0];
            }
        }
        return count;
    }
    
}