
public class pattern {
    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        pattern14(n);
    }
    static void pattern13(int n){

        /*
         * 
         *         1
         *       2 1 2
         *     3 2 1 2 3
         *   4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         */

        for(int r=1;r<=n;r++){
            for(int c=0;c<n-r;c++){
                System.out.print("  ");
            }
            for(int c=r;c>=1;c--){
                System.out.print(c+" ");
            }
            for(int c=2;c<=r;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
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

    static void pattern6(int n) {

                           /*
        * * * * * 
            * * * *
                * * *
                    * *
                        * 
                                   */

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <row*2; col++) {
               System.out.print(" ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n) {

                           /*
             *
           * * *              
         * * * * *
       * *  *  * * *   */

        for (int row = 0; row < n; row++) {
           //space 
           for (int col = 0; col < n-row-1; col++) {
              System.out.print("   ");
            }
            for(int col =0;col<2*row+1;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n) {

                           /*
         *  *  *  *  *  *  * 
            *  *  *  *  *
               *  *  *
                  *
                      */

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("   ");
            }
            for(int col =0;col<2*(n-row)-1;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {

                           /*
             !
           ! * !              
         ! * ! * !
       !  *  !  *  ! *   */

        for (int row = 0; row < n; row++) {
           //space 
           for (int col = 0; col < n-row-1; col++) {
              System.out.print(" ");
            }
            for(int col =0;col<2*row+1;col++){
                if(col%2!=0){
                System.out.print("!");}
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }  
    
    static void pattern10(int n) {

                           /*
            *
            *  *
            *  *  *
            *  *  *  *
            *  *  *
            *  *
            * 
       */

        for (int row = 0; row < n; row++) {
           //space 
           for (int col = 0; col <=row; col++) {
              System.out.print(" * ");
            }
            System.out.println();
        }
        for (int row = n-1; row > 0; row--) {
           //star 
           for (int col = 0; col <row; col++) {
              System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {

                           /*
        * * * * * 
            * * * *
                * * *
                    * *
                        * 
                    * *
                * * *  
            * * * * 
        * * * *                   */

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <row*2; col++) {
               System.out.print(" ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=n-2;row>=0;row--){
            for(int col =0;col<2*row;col++){
                System.out.print(" ");
            }
            for(int col =0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern12(int n) {

                           /*
         *  *  *  *  *  *  * 
            *  *  *  *  *
               *  *  *
                  *
                      */

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" * ");
            }
            for(int col =0;col<2*(n-row)-1;col++){
                System.out.print("   ");
            }
            System.out.println();
        }
    }

   }
