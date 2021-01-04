import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {

        //Write a Stream Expression to find which number squared value is more then 20 from the following list:

        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbers.stream().map(n -> n*n).filter(n -> n > 20).map(n -> (int)Math.sqrt(n)).forEach(System.out::println);
        System.out.println();
        numbers.stream().filter(n -> n*n > 20).forEach(System.out::println);

    }

}
