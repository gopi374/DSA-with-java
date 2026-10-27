class Counter{
    int count=0;

    //synchronised method
    synchronized void increament() {
        count++;
    }

    //synchronized block
    void display() {
        synchronized (this) {
            System.out.println("Hello");
        }
    }
}

class Shared {
    synchronized void waitForSignal() throws InterruptedException {
        System.out.println("Waiting...");
        wait();
        System.out.println("Signal received!");
    }

    synchronized void sendSignal() {

//        notify();// when only one thread to notify
        notifyAll(); // when more than 1 or 2 threads to notify
    }
}
public class Synchronization {
    static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=0;i<50;i++){
                c.increament();
//                if (i==30 || i== 31){
//                    c.display();
//                    System.out.println("thread 1");
//                }
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<50;i++){
                c.increament();
//                if(i==30){
//                    c.display();
//                    System.out.println("thread 2");
//                }
            }
        });
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println(c.count);


        Shared s = new Shared();
        Thread t3= new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t3.start();
        Thread.sleep(500);
        //for synchronized one thread notify
//        synchronized (s) {
//            s.sendSignal();
//        }
        //for notify all the waiting threads
        s.sendSignal();
    }
}
