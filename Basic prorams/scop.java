

public class scop {
    public static void main(String[] args) {
        // scop - means we can't call a variable outside the main method if it created in main
        String name = "Gopi";
        System.out.println(name);
        int b = 50;
        {
            //bloc scop
            b = 500; // we can re-initialise the value in anywhere in methods
            int a = 40;
            System.out.println(a);
        }
        System.out.println(b);
        // System.out.println(a); //cannot access a 
        greet();
    }

    static void greet(){
        int name =60;
        System.out.println(name);
    }
}
