import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        Path filePath = Paths.get("./assets/reversed-lines.txt");
        try {
            List<String> fileContent = Files.readAllLines(filePath);
            List<String> decryptedFileContent = new ArrayList<>();

            for (int i = 0; i < fileContent.size(); i++) {
                String line = "";
                for (int j = fileContent.get(i).length()-1; j >= 0 ; j--) {
                   line += fileContent.get(i).charAt(j);
                }
                decryptedFileContent.add(line);
            }
            for (String nextLine : decryptedFileContent
            ) {
                System.out.println(nextLine);

            }

        } catch (IOException e) {
            System.out.println("File couldn't be read.");
        }

    }
}
