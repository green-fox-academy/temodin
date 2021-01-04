import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise8 {
    public static void main(String[] args) {
       // Write a Stream Expression to concatenate a Character list to a string!

        List<Character> myCharList = Arrays.asList(
                'g',
                'u',
                'm',
                'i',
                'n',
                'u',
                'd',
                'l',
                'i'
        );
        String myString = myCharList.stream().map(String::valueOf).collect(Collectors.joining());

        String myString2 = myCharList.stream().map(Object::toString).reduce("",(a,b) -> a+b);

        System.out.println(myString);
        System.out.println(myString2);
    }
}
