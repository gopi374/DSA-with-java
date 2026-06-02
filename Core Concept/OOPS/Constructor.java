//A constructor is a special method in java that is automatically called when object is created.
//constructors are special methods used to initialize objects. They have the same name as the class and do not have a return type (not even void)
//types of constructor-
//1. default constructor
//2. paramaterized constructor -

//Constructor Overloading -- You can have multiple constructors with different parameter lists.
class Const{
    //default const.
    String name;
    int age;
    
    Const() {
        name = "gopi";
    }
    Const(String name){
        this.name = name; 
    }

    Const(String name, int age){
        this.name = name;
        this.age =age;
    }
    
    
}
public class Constructor {
    public static void main(String[] args) {
        Const con = new Const();
        Const con1 = new Const("Rahul");
        Const con2 = new Const("user2",23);
        String a = con1.name;
        System.out.println(a);
        System.out.println(con.name);
    }
    
}
