package Animal;

public class Dog  extends Animal{

    static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("mike");
        System.out.println(dog.getName());
        dog.Sayhello();
        dog.eat();
    }
}
