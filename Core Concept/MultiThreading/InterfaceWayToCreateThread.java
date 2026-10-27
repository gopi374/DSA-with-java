class Mytask implements Runnable{
    @Override
    public void run(){
        System.out.println("Task running in : "+Thread.currentThread().getName());
    }
}
public class InterfaceWayToCreateThread {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Mytask());
        Thread t2 = new Thread(new Mytask());
        t1.start();
        t1.join();
        System.out.println(t2.isAlive());
        t2.start();
    }
}
