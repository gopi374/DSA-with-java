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
    }
    public void setPassword(int password){
        this.password = password;
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
        Student e = new Student();
        e.setpassword(124536);
        System.out.println(e.getpassword());
        e.setpassword(526341);
        System.out.println(e.getpassword());

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(2000);
        bankAccount.Deposit(2500);
        bankAccount.withdrew(20000);
    }
}