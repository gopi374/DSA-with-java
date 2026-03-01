

import java.util.Scanner;
public class datatypes {
    public static void main(String[] args) {
        // primitive datatypes - they cannot be divided further
        // int a = 10;
        // char b = 'h';
        // float marks = 70.5f;
        // double d=54.5453421541;
        // long l =50688262;
        // boolean check = true;
        // System.out.println(marks);
        Scanner input = new Scanner(System.in);

        //input and output
        // char count = 'X';
        // System.out.println("Does 10 is equal to 0");
        // if(count != 0){
        //     System.out.println("10 is not equal to 0");
        // }
        // else{
        //     System.out.println("10is = 0");
        // }
        // System.out.print("Guess the char: ");
        // char count = input.next().trim().charAt(0);
        // while(count != 'X'){
        //     System.out.print("Wrong char, please guess again: ");
        //     count = input.next().charAt(0);   
        //     if( count == 'X'){
        //         System.out.println("You guessed it right!"); 
        //     }

        // }
        // // int functionsum = Result(5,10);
        // System.out.println("The sum is: " + functionsum);
        // System.out.println("Temprature Convertor");
        // System.out.print("Enter the temprature in calcius:");
        // float calcius = input.nextInt();
        // float farenhiet = (calcius *9/5) +32;
        // System.out.print("The temprature in farenhiet is: " + farenhiet);
        //fabonachi series
        // System.out.print("Enter the size of fabonachi series:");
        // int n = input.nextInt();
        // int a =0 , b=1;
        // System.out.print(a + " " + b + " ");
        // for(int i=2; i<n; i++){
        //     int c = a+b;
        //     System.out.print(c + " ");
        //     a=b;
        //     b=c;
        // }
        // int n =12345;
        // int count =0;
        // while(n>0){
        //     int remind=n%10;
        //     count=count*10+remind;
        //     n=n/10;
        // }
        // System.out.println("the value of count is: " + count);

        //taking input from user till user press X or x
        // System.out.print("Enetr the operation :");
        int ans =0;
        char ch = input.next().trim().charAt(0);
        while(true){
            System.out.println("Enetr the operation :");
            if(ch == '+' || ch == '-' || ch =='*' || ch == '/' || ch =='%'){
                System.out.print("Enetr the NUMBERS :");

                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(ch == '+'){
                    ans= num1 + num2;
                }
                else if(ch == '-'){
                    ans = num2 - num1;
                }
                else if(ch == '*'){
                    ans = num1 + num2;
                }
                else if(ch == '/'){
                    if(num1 == 0){
                        System.out.println("not divide");
                    }
                    else{
                    ans = num2 / num1;
                    }
                }
                else if(ch == '%'){
                    ans= num1 % num2;
                }
                else{
                    System.out.println("No");
                }
            }
            else if(ch == 'X' || ch == 'x'){
                break;
            }
            else{
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }

    }
}
