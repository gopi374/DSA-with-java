public class Function {

    static String greet(){
        String greeting = "Hello coders";
        return greeting;
    }

    static String Mygreet(String n){
        String message ="Hello ";
        System.out.println(message+n);
        return message;
    }
    public static void main(String args[]){
        String msg = greet();

        System.out.println(msg);
        String mymsg = Mygreet("Gopi");



        // int r =54 ,t =4;
        // for(int i = 1;i<=11 ; i++){
        //         for(int j =1; j<=i;j++){
        //             System.out.print("* ");
        //         }
        //         System.out.println();
        //     }
        //     for(int i = 10; i >= 1; i--){
        //         for(int j =1; j<=i;j++){
        //             System.out.print("* ");
        //         }
        //         System.out.println();
        //     }
            
    }
}