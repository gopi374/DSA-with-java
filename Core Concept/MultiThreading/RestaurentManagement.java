import java.util.ArrayList;
import java.util.List;

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

class Order{
    private static int nextId = 1;

    private final int orderId;
    private final String item;
    private final String workerName;

    public Order(String item, String workerName) {
        synchronized (Order.class) {
            orderId = nextId++;
        }

        this.item = item;
        this.workerName = workerName;
    }

    public void display() {
        System.out.println(
                "Order ID: " + orderId + " | Item: " + item  + " | Taken by: " + workerName
        );
    }
}


class Restaurant {
    private final List<Order> orders = new ArrayList<>();

    public synchronized void takeOrder(
            String item, String workerName) {

        Order order = new Order(item, workerName);
        orders.add(order);

        System.out.println(
                workerName + " took an order for " + item
        );

        order.display();
    }

    public synchronized void showOrders() {
        System.out.println("\n--- All Orders ---");

        for (Order order : orders) {
            order.display();
        }
    }
}


public class RestaurentManagement {
    static void main(String[] args) throws InterruptedException{
        Workers w1 = new Workers("JAck");
        Workers w2 = new Workers("BOB");

        w1.assignShift("Morning");
        w2.assignShift("Evening");

        Restaurant restaurant = new Restaurant();
        Thread t1 = new Thread(
                () -> restaurant.takeOrder("Pizza", "Rahul")
        );

        Thread t2 = new Thread(
                () -> restaurant.takeOrder("Burger", "Priya")
        );

        Thread t3 = new Thread(
                () -> restaurant.takeOrder("Pasta", "Rahul")
        );

        t1.start();
        t2.start();
        t3.start();

        // Wait for all orders to finish
        t1.join();
        t2.join();
        t3.join();

        restaurant.showOrders();


    }
}
