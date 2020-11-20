import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How big should be the pyramid like? (whole number)");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {//outer loop to print lines
        for (int j = 1 ; j < (input + i); j++) {//length of line is input + 1
            if(j > (input - i)) { // if pixel no is greater than input - rownum then draw star
            System.out.print("*");} else {
                System.out.print(" ");
            }
        }
        System.out.println();}
    }
}
