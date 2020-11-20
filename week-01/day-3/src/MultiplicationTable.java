import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number and I'll show you it's multiplication table");
        long num = scanner.nextLong();
        if (num > 1000000000) {
            System.out.println("Please enter a number less or equal to 1 000 000 000");
        } else {
            for (int i = 1; i < 11; i++) {
                System.out.println(i + " * " + num + " = " + i * num);
            }
        }
    }
}
