import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        Path filePath = Paths.get("./assets/duplicated-chars.txt");
        try{
        List<String> fileLines = Files.readAllLines(filePath);
        List<String> fileLinesDecrypted = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        String lineDecrypted;

            for (int i = 0; i < fileLines.size(); i++) {
                {
                    for (int j = 0; j < fileLines.get(i).length(); j += 2) {
                        line.append(fileLines.get(i).substring(j, j + 1));
                    }
                    lineDecrypted = line.toString();
                    fileLinesDecrypted.add(lineDecrypted);
                    line = new StringBuilder();
                }
                for (String nextline : fileLinesDecrypted
                ) {
                    System.out.println(nextline);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read file.");
        }
        //List<String> fileWords = new ArrayList<>();

    }

}

