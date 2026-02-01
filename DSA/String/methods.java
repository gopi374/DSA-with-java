import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "gopi banjara section-A";
        System.out.println(Arrays.toString(name.toCharArray()));//it will print in form arrays.
        System.out.println(name);//normal
        System.out.println(name.strip());
        System.out.println(name.trim());
        System.out.println(Arrays.toString(name.split(" ")));//split where it found spaces
    }
}
