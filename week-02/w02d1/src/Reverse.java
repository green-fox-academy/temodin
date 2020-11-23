import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7};
        int[] temp = new int[5];
        System.out.println(Arrays.toString(temp));
        int j = 0;
        for (int i = numbers.length -1; i >= 0; i--) {
            temp[j] = numbers[i];
            j++;
        }
        numbers = temp;
        System.out.println(Arrays.toString(numbers));
    }
}
