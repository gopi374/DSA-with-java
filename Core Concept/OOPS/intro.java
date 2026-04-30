class Pen{
    String color;
    String type;

    public void Write(){ //methods of class
        System.out.println("Writting");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

//Notes - Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance by providing some concepts defined below : 
//Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data. For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. The class does not occupy any memory space till the time an object is instantiated. 
//Object is a run-time entity. It is an instance of the class. An object can represent a person, place or any other item. An object can operate on both data members and member functions. 

//this keyword -  ‘this’ keyword in Java that refers to the current instance of the class. In OOPS it is used to: 
//1.pass the current object as a parameter to another method 
//2.refer to the current class instance variable

public class intro {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "black";
        pen1.printcolor();
    }
    
}
