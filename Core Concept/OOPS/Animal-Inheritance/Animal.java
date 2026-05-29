package Animal;
//Inheritance -> child can access the parent class methods and fields using extends keyword


public class Animal {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Sayhello(){
        System.out.println("Hello from animal");
    }
    public void eat(){
        System.out.println("animals eats food");
    }

}
