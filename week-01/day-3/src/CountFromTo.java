import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number");
        int a = scanner.nextInt();
        System.out.println("Give me another number");
        int b = scanner.nextInt();

        if (a > b) {System.out.println("The second number should be bigger");}
        else {
            //for (int i = a; i < b; i++) {System.out.println(i);}
            for (; a < b; a++) {System.out.println(a);}
        }
    }
}
