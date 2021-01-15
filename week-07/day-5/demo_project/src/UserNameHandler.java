import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UserNameHandler {


    public static void echoInput(String userInput) {
        System.out.println(userInput);
    }

    public static String encode(String stringToEncode) {
        String encodedString;
        try {
            encodedString = URLEncoder
                    .encode(stringToEncode, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            encodedString = null;
        }
        return encodedString;
    }

    public static boolean checkString(String stringToCheck) {
        return stringToCheck.matches("^[a-zA-Z0-9_]+$");
    }


    public static void main(String[] args) {
        System.out.println("Enter the name of your fox");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        echoInput(userInput);
        echoInput(encode(userInput));
        checkString(userInput);
        System.out.println(checkString(userInput) ? "User input valid" : "Please use only letters of english alphabet, numbers and underscore");
    }
}
