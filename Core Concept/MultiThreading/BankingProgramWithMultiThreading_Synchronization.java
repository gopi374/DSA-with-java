class Banking{
    int Balance = 1000;

    synchronized void withdraw(int a){
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
        Thread t1 = new Thread(()->{
            bank.withdraw(700);
        });
        Thread t2 = new Thread(()->{
            bank.withdraw(400);
        });

        t1.start();
        t2.start();
    }
}
