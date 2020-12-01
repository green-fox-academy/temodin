import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {

    public static int countLines (Path filePath) {
        int result;
        try {
            List<String> lines = Files.readAllLines(filePath);
            result = lines.size();
        } catch (IOException e) {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a filename");
        String fileName = scanner.next();

        Path filePath = Paths.get("./assets/" + fileName);


        System.out.println(countLines(filePath));


        }

    }




