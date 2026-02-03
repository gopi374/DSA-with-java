
public class pattern {
    public static void main(String[] args) {
        int n = 4;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        pattern5(n);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        /*
         * output
         * 
         * 
         * *
         * * *
         * * * *
         * 
         */
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    /*
     * o/p
     
     * * * *
     * * *
     * *
     *
      
     */

    static void pattern3(int n) {

        /*
               *
             * *
           * * *
         * * * *
                 */
        for (int row = 0; row < n; row++) {
            //space
            for (int col = 0; col < n- row-1; col++) {
                System.out.print("  ");
            }
            //star
            for(int col=0;col<row+1;col++){
                System.out.print(" *"); 
            }
            System.out.println();
        }
    }


    static void pattern4(int n) {

        /*
         * * * *
           * * *
             * *
               *
                    */
        for (int row = 0; row < n; row++) {
            //space
            for (int col = 0; col < row; col++) {
                System.out.print("  ");
            }
            //star
            for(int col=0;col<n-row;col++){
                System.out.print(" *"); 
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

                           /*
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
                      */

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(row==0 || row==n-1 || col==0 || col==n-1)
                {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
