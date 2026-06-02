//In hierarchial inheritance , it forms like an tree
//            class A
//            /    \
//      class B    class C   

class Animal{
    String name;
    String category;
    String type;
    public void ShowName(){
        System.out.println(name);
    }
    
}
class Dog extends Animal{

    
}
class Cat extends Animal{
    public void sound(){
            for(int i=0;i<5;i++){
                System.out.print("MEOWw"+" ");
            }
    }
}

public class Hierarchialinheritance {
    public static void main(String args[]){
        Cat cat = new Cat();
        cat.name = "MEw OUT";
        cat.ShowName();
        cat.sound();
        Dog dog =new Dog();
        dog.
    }    
}
