import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numToGuess = (int) (Math.random() * 100);
        System.out.println("Guess the number I am thinking of (1-100)");
        int userInput = scanner.nextInt();
        while (userInput != numToGuess) {
            if (userInput > numToGuess) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("The stored number is higher");
            }
            userInput = scanner.nextInt();
        }
        System.out.println("Congrats. You are amazing.");
    }
}
