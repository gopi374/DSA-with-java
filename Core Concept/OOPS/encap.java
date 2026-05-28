import java.util.Scanner;

class Student {

    //Encapsulation - bundling the data into an single unit.
    // -> making the data(fields/variable) private/controlled access
    // -> controlled by getter and setter methods

    // private variables (hidden data)
    private String name;
    private int password; //

    // setter method() 
    public void setName( String name) {
        this.name = name;
    }
    // this keyword refers to the current object of the class
    // it is used inside methods to access current object data

    // getter method()
    public String getName() {
        return name;
    }

    public void setpassword(int password) {
        this.password = password;
    }

    public int getpassword() {
        return password;
    }

}
class BankAccount{
    private int accNum;
    private int password;
    private int balance;
    private int deposit;
    private int withdraw;

    public void setAccNum(int accNum){
        this.accNum = accNum;
        System.out.println("Account Number added SucessFully");
    }
    public void setPassword(int password){
        this.password = password;
        System.out.println("Password added SuccessFully");

    }

    public void setBalance(int balance){

        this.balance = balance;
        System.out.println("Initial Balance :"+balance);
    }

    public int getBalance(){
        return this.balance;
    }
    public void Deposit(int amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Amount deposited :"+amount);
            System.out.println("Total Balance :"+balance);
        }else{
            System.out.println("Invalid amount");
        }

    }

    public void withdrew(int amount){
        if(amount >0 && amount <= balance){
            balance-=amount;
            System.out.println("Amount Withdrew :"+amount);
            System.out.println("Total Balance :"+balance);
        }else{
            System.out.println("Insuffiecient Balance");
        }
    }

    public int getPassword() {
        return password;
    }

    public int getAccNum() {
        return accNum;
    }

}

public class encap {
    public static void main(String[] args) {
//        Student e = new Student();
//        e.setpassword(124536);
//        System.out.println(e.getpassword());
//        e.setpassword(526341);
//        System.out.println(e.getpassword());


        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);
        int initial =sc.nextInt();

        bankAccount.setAccNum(732365);
        bankAccount.setPassword(882451);
        bankAccount.setBalance(initial);
        bankAccount.Deposit(2500);
        bankAccount.withdrew(23);
    }
}