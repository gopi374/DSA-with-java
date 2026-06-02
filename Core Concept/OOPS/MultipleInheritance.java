//Java does not support multiple inheritance of classes to avoid ambiguity problems such as the Diamond Problem and to 
//keep the language simpler. Instead, Java supports multiple inheritance through interfaces, allowing a class to implement 
// multiple interfaces without inheriting conflicting state from multiple parent classes.

// ex - class C extends A , B{} -
//                              it will throw errors because java doesn't support multiple inheritace from more than one class.

// for multiple inheritance , we use interfaces
// An interface is a blueprint of a class that defines a set of methods that implementing classes must provide.
interface A{
    String name = "gopi";
    void methodA();
}
interface  B{
    void methodB();
}
interface D{
    void methodD();
}
class C implements A,B,D{
    public void methodA(){
        System.out.println("tHis is method A");
    }
    public void methodB(){
        System.out.println("THis is method B");
    }
    public void methodD(){
        System.out.println("this is method D");
    }
}
public class MultipleInheritance {
    public static void main(String args[]){

        C c = new C();
        c.methodA();
        c.methodB();
        c.methodD();        
    }    
}
