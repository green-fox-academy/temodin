import java.util.Scanner;

public class DivideByZero {

    public static int divideByZero (int divisor){
        return 10/divisor;
    }

    public static int getUserInput () {
        System.out.println("Enter a number.");
        Scanner scanner = new Scanner(System.in);
       return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        try {
        System.out.println(divideByZero(getUserInput())); }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
