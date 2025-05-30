import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesSaving {

    public static void createFilePath(Path filePath) {
        if (!Files.exists(filePath)) throw new NullPointerException("File path is null or empty");

        try {
            Path path = Paths.get(filePath.toUri());
            Files.createFile(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
//        return null;
    }

    public static File writeTofile(String filepath, String content) {

    }
}