class Workers{
    private final String Name;
    private boolean orderAssigned = false;

    public Workers(String name){
        this.Name=name;
    }

    public synchronized void assignShift(String shift){
        if(!orderAssigned){
            orderAssigned=true;
            System.out.println(Name + " assigned to "+" shift "+shift);
        }else{
            System.out.println(Name+" is already assigned shift !");
        }
    }

}

public class Hotel_Management {
    static void main(String[] args) throws InterruptedException{
        Workers w1 = new Workers("JAck");
        Workers w2 = new Workers("BOB");
        Thread manager1 = new Thread(()->w1.assignShift("morning"),"Manager 1");
        Thread manager2 = new Thread(()->w2.assignShift("evening"),"Manager 2");
        manager1.start();
        manager2.start();
        manager2.join();
        System.out.println("All shifts assigns");
    }
}
