import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class File_handling {
    static void main(String[] args) throws IOException{
        try {
            File f = new File("Student.txt");
            if (f.exists()){
                System.out.println("Already exists !");
                return;
            }
            if (f.createNewFile()) {
                System.out.println("file Found & created !");
            } else {
                System.out.println("Coudn't create file");
            }
        }catch (IOException e){
            System.out.println(e);
        }

        FileWriter fw = new FileWriter("Student.txt");
        fw.write("hello");
        System.out.println("data written complete");
    }
}
