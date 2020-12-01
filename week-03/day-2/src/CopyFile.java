import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    public static boolean copyFileContent(Path fromFile, Path toFile) {
        try {
            List<String> fileContent = Files.readAllLines(fromFile);
            Files.write(toFile, fileContent);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Path fromFile = Paths.get("./assets/my-file.txt");
        Path toFile = Paths.get("./assets/your-file.txt");

        System.out.println(copyFileContent(fromFile, toFile));

    }
}
