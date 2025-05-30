import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInput {

    public static void main(String[] args) {

        File file = new File("/home/bibi/Documents/Java-Assignments/FileTask/src/stringclass.txt");

        try (FileInputStream fileInputStream = new FileInputStream(file);
             DataInputStream dataInputStream = new DataInputStream(fileInputStream)) {
            byte[] word = dataInputStream.readAllBytes();
            System.out.println(new String(word));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
