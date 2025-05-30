import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Print {

    public static void main(String[] args) {

        String path = ("/home/bibi/Documents/Java-Assignments/FileTask/src/stringclass.txt");
        try (PrintStream printStream = new PrintStream(path)){
            System.setOut(printStream);
            System.out.println("Abimbola weds Femi");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
