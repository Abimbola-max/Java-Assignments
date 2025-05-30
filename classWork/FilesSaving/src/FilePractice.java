public class FilePractice {

    public static void createFile(String path) {
        try {
            if (path == null || path.isEmpty) throw new IllegalArgumentException("path is null or empty");
            URI uri = getValid(path);
            Path foundPath = Path.of(uri.getPath());
            if (checkIfFileExist(foundPath)) throw new IllegalArgumentException("file already exists");
            Files.createFile(foundPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByPath(String path) {

    }

    public static void writeToFile(String filePath, String content) {

    }
}