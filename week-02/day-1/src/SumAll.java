import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7};
        int sumAll = 0;
        for (int i = 0; i < numbers.length; i++) {
           sumAll += numbers[i];
        }
        System.out.println(sumAll);
    }
}

