import java.util.Arrays;
import java.util.Scanner;
class Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        numbers[0] = 23;
        numbers[1] = 45;    
        numbers[2] = 67;
        numbers[3] = 89;
        numbers[4] = 12;
        numbers[5] = 34;
        numbers[6] = 56;
        numbers[7] = 78;
        numbers[8] = 90;

        // int a;
        // System.out.println("Enter the index of element you want to add number:");
        // a = sc.nextInt();
        // System.out.println("Enter the number you want to add:");
        // int b = sc.nextInt();
        
        // numbers[a] =b;
        // System.out.println("You have added/Update number " + b + " at index " + a); 

        // int num = numbers[0];
        // int length = numbers.length;
        // System.out.println("length of an array :"+ length);

        // Array traversing - Accessing Every elements of an array atleast one time is called array traversing .
        // for(int i = 0 ; i <length; i++){
        //     System.out.println("Element at index " + i + ": " + numbers[i]);
        // }

        // // Accessing an element at index by Exception Handling
        // try {
        //     System.out.println("Accessing element at index"+" : " + num);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Error: Index out of bounds. Please check the array size.");
        // }

        System.out.println(Arrays.toString(numbers));


        //array of object 
        String[] names = new String[10];
        for(int i = 0 ; i<names.length ; i++){
            names[i] =sc.nextLine();
        }
        System.out.println("String array is :");
        for(String str : names){
            System.out.println("output is: "+str);
        }

        sc.close();
    }
}
