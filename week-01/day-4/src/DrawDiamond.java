import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How big should be the pyramid like? (whole number)");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {//outer loop to print lines
            for (int j = 1 ; j < (input + i); j++) {//
                if(i < input / 2 + 1) {
                    if (j > (input - i) ) {
                    System.out.print("*");} else {
                    System.out.print(" ");
                }}
                /*else {
                if(j > (input - i){
                    System.out.print("*");} else {
                    System.out.print(" ");
                }*/
            }
            System.out.println();}
    }
}
