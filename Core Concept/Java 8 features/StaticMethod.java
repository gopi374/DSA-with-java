//Java 8 allows interfaces to contain static methods with implementations.
//A static interface method belongs to the interface itself and is generally called using the interface name.



interface Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethod {
    static void main(String[] args) {
        System.out.println(Calculator.add(45,5));
    }
}
