
//inheritance refers to acquiring the superclass/parent class properties and methods in subclass
//inheritance used for code reusability 
class Grandfather{

    //single level inheritance ( class A -> class B)
    //In Single level inheritance only one class extends(acquire) the parents class properties.
    String name;
     
    public void sayHello(){
        System.out.println(name+": Hellooo");
    }
}
class Parents extends Grandfather{

    public void hii(){
        System.out.println("Hiii");
    }
}

class Child extends Parents{
    //multilevel inheritance (class Grandfather -> class Parents -> class Child)
    void childname(){
        this.name = name;
        System.out.println("Child name :"+name);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Parents p = new Parents();
        p.name="rahul";
        p.hii();
        p.sayHello();
        Child c = new Child();
        c.name = "BOB";
        c.childname();
        c.hii();
        c.sayHello();
    }
}
