//abstraction is the process of hiding implementation details and exposing only essential functionality, achieved using abstract classes and interfaces
//Abstract Classes--
//Declared using the abstract keyword.
//Cannot be instantiated directly.
//in abstract class , we can defined both methods(abstract or concreate)


abstract class Animal{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public abstract void sound(); // those methods do have not body are known as abstract methods

    public void sayhello(){ //those methods have body are known as concrete methods
        System.out.println(".....");
    }
}

class Dog extends Animal{

    @Override
    public void sound(){
        System.out.println("Woooof");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        
    }
}
