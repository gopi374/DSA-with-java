//Access modifiers - are used to controls the code visibility(scope) means we can define the accessebility of  classes , varialbe, methods . 
//types of Access modifiers - 
// public -- it can access from anywhere in program (in same packege or outside)
// protected -- it is only accessible in same package by subclass, it is mostly used in inheritance to allow child class used parent class properties.
// default --(no modifier specifies) Accessible only within the same package.
// private -- only accessible in same class within same package


class Animal{
    //public 
    public void sleep(){
        System.out.println("Zhzzzzz");
    }
    //protected
    protected void category(){
        System.out.println("fly");
    }
    //private
    private int age;

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
class Dog extends Animal{
    @Override
    public void sleep(){
        System.out.println("dog sleeps");
    }
}
class intro{
    public static void main(String args[]){
        Animal a = new Dog();
        a.category();
        a.setAge(5);
        System.out.println(a.getAge());

    }
}