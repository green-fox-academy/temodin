import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many boys gonna be there?");
        int boys = scanner.nextInt();

        System.out.println("How many girls gonna come?");
        int girls = scanner.nextInt();

        if ((girls == boys) && (girls + boys) >= 20) {
            System.out.println("The party is excellent!");
        }
        else if ((girls + boys) >= 20 && girls > 0){
            System.out.println("Quiet cool party!");
        }
        else if ((girls + boys) < 20 && girls > 0){
            System.out.println("Average party!");
        }
        else{
            System.out.println("Sausage party!");
        }
    }
}
