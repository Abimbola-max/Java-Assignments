import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileExercise {
    public static void main(String[] args) {
//        File file = new File("/home/bibi/Documents/Java-Assignments/FileTask/src/StringClass.java");
//        System.out.println(file.isFile());
//        the difference between files and file is that, files is the guy doing the main work, has the implementations and all while file is used to check methods
//        // file input stream: reading to the files
        // file output stream: writing from the file
        // object input stream
        // object output stream
        // print stream
//
//        try {
//            Path path = Paths.get("/home/bibi/Documents/Java-Assignments/FileTask/src/stringclass.txt");
//            String description = "Bibi is a darling";
//            Files.createFile(path);
////            Files.
//            Files.write(path, description.getBytes());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//        File file = new File("/home/bibi/Documents/Java-Assignments/FileTask/src/stringclass.txt");
        File file = new File("/home/bibi/Documents/Java-Assignments/FileTask/src/stringclass.txt");

        try (
//                FileOutputStream fileOutputStream = new FileOutputStream(file);
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
//            User user = new User();

            String word = "Hello world";
//            objectOutputStream.write(65);
            byte[] value = objectInputStream.readAllBytes();
            System.out.println(Arrays.toString(value));
            String message = new String(value);
            System.out.println(message);
//          FileInputStream fileInputStream = new FileInputStream(file);
//            byte[] bytes = new byte[4];
//            byte[] bytes = fileInputStream.readAllBytes();
//            int result = fileInputStream.readNBytes(bytes, 0, 5);
//            System.out.println(Arrays.toString(bytes));
//            String value = new String(bytes);
//            System.out.println(value);
//            System.out.println(result);
            fileInputStream.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}