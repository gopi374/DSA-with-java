//polymorphism means many forms, it allow method to do different things on object creation even though the name and signature of mathods are also same;
//it has two 2 types
// 1. compile time polymorphism-> it can achieved by mothod overlaoding which means an methods have same name with different parameters , different return types.
// 2. run time polymorphism -> it can achieved by inheritance and method overriding means a method with same name in super and sub class , they acts as different forms.

//1
class Calculator{
    public int add(int a , int b){
        return a+b;
    }
    public int add(int a , int b , int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a+b;
    }
}


//2
class Animal{
    void sayHello(){
        System.out.println("Animal is saying hello");
    }
}
class Dog extends Animal{
    @Override //it is used to annotation for best practices
    void sayHello(){
        System.out.println("Wooof");
    }
    public void bye(){
        System.out.println("woof woof");
    }
}
class Cat extends Animal{
    @override
    void sayHello(){
        System.out.println("Meow meow");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        //1
        Calculator calc =new Calculator();
        System.out.println(calc.add(1,5));
        System.out.println(calc.add(4,8,96));
        System.out.println(calc.add(460.39,145.2336));

        //2
        Dog dog = new Dog(); 
//       |
//      we can also change the subclass's reference to superclass(Animal) 
        dog.sayHello();
        
        Animal dog1 = new Dog();
//      it can only access those methods that are defined in Animal class.
        dog1.sayHello();
        //it can't access dog1.bye();

        Cat cat = new Cat();
        cat.sayHello();
        


        //upcasting (child -> parent) - Converting a subclass reference into a superclass reference.
        Animal a = dog;

        //Downcasting (Parent → Child) - Converting a superclass reference back into a subclass reference.
        Dog dog2 = (Dog) a;    
        System.out.println(a);
        
    }
}
