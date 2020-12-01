import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class WriteSingleLine {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    public static void main(String[] args) {

        String content = "Uborka Géza";
        Path filePath = Paths.get("./assets/my-file.txt");
        try {
            Files.write(filePath, Collections.singleton(content));
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }


}
