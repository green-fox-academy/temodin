import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        var sum = new Sum();

        System.out.println(sum.sum(testList));
    }
}
