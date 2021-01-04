import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {

    public static void main(String[] args) {

        //Write a Stream Expression to find the frequency of characters in a given string!

        System.out.println(findFrequency("guminudli",'i'));

        String myString = "guminoci";
        Map<Object,Long> charCount = myString.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        charCount.forEach((c,v) -> System.out.println(c + ":" + v));

        System.out.println();

        myString.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((c,v) -> System.out.println(c + ":" + v));
            }

    static long findFrequency (String myString,Character charFrequencyOf ) {
        return myString.chars().filter(c -> c == charFrequencyOf).count();
    }

}