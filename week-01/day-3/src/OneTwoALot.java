import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number and press enter.");
        int myNum = scanner.nextInt();
        if (myNum <= 0) {System.out.println("Not enough.");}
        else if (myNum == 1) {System.out.println("One.");}
        else if (myNum == 2) {System.out.println("Two.");}
        else if (myNum >= 2) {System.out.println("A lot.");}
        else {System.out.println("Error.");}

    }
}
