//A lambda expression in Java is a short way to write an implementation of a functional interface
// syntax :- (params)->{body}
// -> lambda operator
public class LambdaExpression {
    static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Java");

        r.run();
    }

}
