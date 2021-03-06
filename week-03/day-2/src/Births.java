import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Births {
    // Create a function that
    // - takes the name of a CSV file as a parameter,
    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // - returns the year when the most births happened.
    //   - if there were multiple years with the same number of births then return any one of them

    // You can find such a CSV file in this directory named births.csv
    // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.

    public static void mostBirths (Path csvPath) {
        List <String> lines= new ArrayList<>();
        try {
            lines = Files.readAllLines(csvPath);
        } catch (IOException e) {
            System.out.println("File not found");
        }
        List <String> birthyears = new ArrayList();
        for (String line: lines
             ) {
            String[] splitLine = line.split(";");
            birthyears.add(splitLine[1].substring(0,4));
        }
        Collections.sort(birthyears);
        System.out.println(birthyears);

        int currentFrequency = 0;
        int maxFrequency = 0;
        String mostFrequentYear = birthyears.get(0);

        for (int i = 0; i < birthyears.size(); i++) {
            currentFrequency = 0;
            for (int j = 0; j < birthyears.size(); j++) {
                if (birthyears.get(i).equals(birthyears.get(j))) {
                    currentFrequency++;}
            }
            if (currentFrequency > maxFrequency) {
                mostFrequentYear= birthyears.get(i);
            maxFrequency = currentFrequency;}
        }

        System.out.println(mostFrequentYear);
    }


    public static void main(String[] args) {
        Path csvPath = Paths.get("./assets/births.csv");
        mostBirths(csvPath);
    }
}
