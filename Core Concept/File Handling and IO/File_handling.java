import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class File_handling {
    static void main(String[] args) throws IOException{
        try {
            File f = new File("Student.txt");
            System.out.println(f.getPath());

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
        try{
        FileWriter fw = new FileWriter("Student.txt");
        fw.write("hello");
        System.out.println("data written complete");}
        catch (Exception e){
            System.out.println(e);
        }

//        Operation	Java Class or Method
//        Create a file	File.createNewFile()
//        Check file existence	File.exists()
//        Write text	FileWriter.write()
//        Read text	FileReader.read()
//        Append text	new FileWriter(path, true)
//        Delete a file	File.delete()
//        Get file size	File.length()
//        Create a directory	File.mkdir()
//        Read a line	BufferedReader.readLine()
    }
}
