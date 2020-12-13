import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CowsAndBulls {
    private Integer numberToGuess;
    private int guessCounter = 0;
    String userInput = "";
    Scanner scanner = new Scanner(System.in);

    public CowsAndBulls() {
        numberToGuess = (int) (1000 + Math.random() * 9000);
    }

    public void guess() {
        String numberToGuessString = numberToGuess.toString();
        while (!userInput.equals(numberToGuessString)) {
            guessCounter++;
            do {
                System.out.println("Your next guess, four digits:");
                userInput = scanner.next();
            }
            while (!isUserInputCorrect(userInput));
            System.out.println(checkDigitAndGiveFeedback(userInput, numberToGuessString));
        }
        System.out.println("Congrats, you guessed the number after " + guessCounter + " tries.");
    }

    public boolean contains(String numberToGuessString, char charToCheck) {
        for (int i = 0; i < numberToGuessString.length(); i++) {
            if (numberToGuessString.charAt(i) == charToCheck) {
                return true;
            }
        }
        return false;
    }

    public List<String> checkDigitAndGiveFeedback(String userInput, String numberToGuessString) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == numberToGuessString.charAt(i)) {
                answer.add("COW");
            } else if (contains(numberToGuessString, userInput.charAt(i))) {
                answer.add("BULL");
            }
        }
        return answer;
    }

    public boolean isUserInputCorrect(String userInput) {
        if (userInput.length() != 4) {
            return false;
        }
        for (int i = 0; i < userInput.length(); i++) {
            if (!Character.isDigit(userInput.charAt(i))) {
                return false;
            }
        }
        return true;
    }


}
