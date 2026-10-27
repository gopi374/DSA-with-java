class Banking{
    int Balance = 1000;

    synchronized void withdraw(int a){
            Thread.yield(); //it stops the current thread's execution and give to another executes , it is thread schedular
        if(a <= Balance){
            System.out.println(Thread.currentThread().getName()+" withdraw amount :"+a);
            Balance-=a;
            System.out.println("Remaining Balance :"+Balance);
        }
        else{
            System.out.println("❌ Insufficient Balance !");
        }
    }
}
public class BankingProgramWithMultiThreading_Synchronization {
    static void main(String[] args) throws InterruptedException{
        Banking bank = new Banking();
        Thread t1 = new Thread(()-> bank.withdraw(700) , "T1");
        Thread t2 = new Thread(()-> bank.withdraw(400) , "T2");

        t1.start();
        t2.start();
        System.out.println(t1.getState());
    }
}
