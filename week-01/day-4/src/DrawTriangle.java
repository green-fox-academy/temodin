import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to define the size of the triangle");
    int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j < i + 1; j++)
                System.out.print("*");
        System.out.println();}
    }
    }
