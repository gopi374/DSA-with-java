class A{
    A(){
        System.out.println("A constructor");
    }
}
class B extends A{
    B(){
        super(); // it will call parent class constructor first.
        System.out.println("B is calling");
    }

}
public class constructorwithSuper {
    public static void main(String[] args) {
        B b = new B();
        //O/p ->A constructor
        //      B is calling
    }
}
