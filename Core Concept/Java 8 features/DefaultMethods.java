// A default method is a method inside an interface that has an implementation and is declared using the default keyword.


interface Vehicle1 {
    default void start() {
        System.out.println("Vehicle is starting");
    }

}

class Gaadi implements Vehicle1 {
}

public class DefaultMethods {
    static void main(String[] args) {
        Gaadi c = new Gaadi();
        c.start();
    }
}
