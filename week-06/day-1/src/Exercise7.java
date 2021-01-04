import java.util.Arrays;
import java.util.List;

public class Exercise7 {

    static void findCities(List<String> cities, Character startChar) {
        cities.stream().filter(c -> c.charAt(0) == startChar).forEach(System.out::println);
    }

    public static void main(String[] args) {

        //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        Character startChar = 'A';

        cities.stream().filter(c -> c.charAt(0) == startChar).forEach(System.out::println);

        System.out.println();

        findCities(cities,'N');
    }
}
