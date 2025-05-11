import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesSaving {

    public static File createFilePath(Path filePath) {
        try {
            URI uri =
//            Path path = Paths.get(;
            Files.createFile(filePath);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}