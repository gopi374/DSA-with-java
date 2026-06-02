
//inheritance refers to acquiring the superclass/parent class properties and methods in subclass
//inheritance used for code reusability 
class Grandfather{

    //single level inheritance
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


public class inheritance {
    public static void main(String[] args) {
        Parents p = new Parents();
        p.name="rahul";
        p.hii();
        p.sayHello();
    }
}
