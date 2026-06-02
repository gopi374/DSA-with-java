abstract class Vehicle{

    private int a;
    // Vehicle(){  -> this is not instantiated/constructerised
    //     System.out.println("a");
    // }

    protected Vehicle() { //it can only accesible in extends class(subclass)

        System.out.println("protected constructor");
    }
    
    public abstract void accelerate();
    public abstract void brake(); //this method can access with vehicle class instance

}
class Cycle extends Vehicle{
    Cycle(){
        super();
        System.out.println("Cycle");
    }
    public void accelerate(){

        System.out.println("accelerating");
    }
    public void brake(){
        System.out.println("stooped");
    }
}

public class VehicleAbstraction {

    public static void main(String[] args) {
        Vehicle c = new Cycle();
        c.brake();
    }
    
}
