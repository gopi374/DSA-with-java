import java.util.Scanner;
class lab_manual {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        //pro. 1
        System.out.println("Hello world");
        //pro.2
        int a = 10, b = 20;
        int sum =a+b;
        System.out.println("Sum of a and b is: " + sum);
        //program 3
        if(sum > 100){
            System.out.println("sum is greate than 100");
        }
        else{
            System.out.println("sum is greate than 100");
        }
        //program 4
        for(int i = 0;i<=5; i++){
            System.out.println(i);
        }
        //program 5 prime number
        System.out.println("Enter the number to check the prime number or not");
        int num=sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number is not prime.");
        }
        //program 6 factorial
        int fact = 1;
        int i =1;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("factorial of "+num+" is "+fact);
        //program 7 area of circle
        double pi = 3.14;
        System.out.println("Enter the radiesof circle");
        int radius = sc.nextInt();
        System.out.println("Area of Circle of radius "+radius+" is "+pi*radius*radius);

        //program 8 simple interrest
        double p=10000,r=2,t=2,si;
        si = (p*r*t)/100;
        System.out.println("Simple interest of the given inputs is "+si);
        
        //program 9 
    }
}
