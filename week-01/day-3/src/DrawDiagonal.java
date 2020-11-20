import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to define the size of the square");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) { //outer loop to print newlines
                if ((j == 1) || (j == i) || i == num || j == num || i == 1) {
                    //inner loop to print % if left side/ diagonal/ bottom/ right side/ top
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
