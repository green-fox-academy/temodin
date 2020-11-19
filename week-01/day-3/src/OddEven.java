import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number and press enter.");
        int myNum = scanner.nextInt();
        if(myNum % 2 == 0) {System.out.println("even");
        }
        else {System.out.println("odd");
        }
    }
}
