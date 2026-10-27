public class MyThread extends Thread{
    public void run(){ //define the task that is perormed
        for(int i=1;i<6;i++){

            System.out.println("i = "+i);
            if(i==2){
                try {
                    Thread.sleep(3000); // pauses the execution for specified time
//                    Thread.currentThread().interrupt();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
        public static void main(String[] args) throws InterruptedException{

//            Thread t = new Thread(()->{
//                System.out.println("New method to create thread");
//            });
//            t.start();
//            t.join();
            MyThread t1 = new MyThread();

            MyThread t2 = new MyThread();

            t1.setName("first thread");

            System.out.println(t1.getName());

            t1.start(); // start the new thread

            Thread currentThread = Thread.currentThread();//it identify which is current thread running

            System.out.println(currentThread);

            System.out.println(t1.isAlive()); //it check the status of thread

            t1.join(); //join waits an thread to another thread finsh
//
//            System.out.println("thread 1 end !");

//            System.out.println(t2.getName());

//            t2.start();
//
//            t2.join();
//
//            System.out.println("All thread complete");

            //common methods -> setpriority() ,getpriority(), getName(), setName() ,currentThread()

        }
}
