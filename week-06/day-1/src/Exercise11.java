import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exercise11 {

    public static void main(String[] args) {
        String fileName = "input.txt";
        Stream<String> textStream = null;
        try {
            textStream = Files.lines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("No such file exists!");
            System.exit(2);
        }
        //textStream.forEach(System.out::println);
        textStream.map(s -> s.split(" ")).forEach(System.out::println);

    }
}
