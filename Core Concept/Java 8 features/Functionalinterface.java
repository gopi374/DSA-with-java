@FunctionalInterface

//A functional interface is an interface that contains exactly one abstract method.
interface Message {
    void display();
}


public class Functionalinterface {
    public static void main(String[] args) {
        Message m = () -> System.out.println("Hello Java 8");

        m.display();
    }
}
