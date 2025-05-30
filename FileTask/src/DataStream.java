import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

    public static void main(String[] args) {
        File file = new File("/home/bibi/Documents/Java-Assignments/FileTask/src/stringclass.txt");

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)
                ) {
            String word = "Abimbola is a darling";
            dataOutputStream.write(word.getBytes());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
