import java.util.Arrays;

public class PrintElements {
    public static void main(String[] args) {
        int[] numbers = {4,5,6,7};
        System.out.println(Arrays.toString(numbers)); //using toString method

        for (int i = 0; i < numbers.length; i++) { //using for loop
            System.out.println(numbers[i]);
        }
    }
}
