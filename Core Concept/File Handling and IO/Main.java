import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("Student.txt");

        try {
            Files.writeString(path, "Hello, Java!");

            String data = Files.readString(path);

            System.out.println(data);

        } catch (IOException e) {
            System.out.println("File operation failed.");
        }
    }
}