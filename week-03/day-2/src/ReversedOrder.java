import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        Path filePath = Paths.get("./assets/reversed-order.txt");
        List<String> fileContent = new ArrayList<>();
        List<String> decryptedFileContent = new ArrayList<>();

        try {
            fileContent = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("File couldn't be read.");
        }
        for (int i = fileContent.size() - 1; i >= 0; i--) {
            decryptedFileContent.add(fileContent.get(i));
        }

        for (String nextLine : decryptedFileContent
        ) {
            System.out.println(nextLine);
        }
    }}



