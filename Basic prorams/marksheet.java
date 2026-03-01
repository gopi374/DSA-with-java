import java.util.Scanner;
class input_if_else
{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("this is the marksheet percentage calculator"); 
System.out.print("Enter your marks of physics :");
int phy = scanner.nextInt();
System.out.print("Enter your marks of hindi :");
int hindi = scanner.nextInt();
System.out.print("Enter your marks of english :");
int english = scanner.nextInt();
System.out.print("Enter your marks of maths :");
int maths = scanner.nextInt();
System.out.print("Enter your marks of chemistry :");
int chemistry = scanner.nextInt();
int total = (hindi + english + phy + chemistry + maths)/5;
System.out.println("your total percentage is "+total+"%");
if(total > 90){
System.out.print("Hurrayyy !! , You are a topper ");
}
else if(total <=80){
System.out.print("Hurrayyy !! , You perform well ");
}
else{
System.out.print("Average !!");
}
scanner.close();
}
}