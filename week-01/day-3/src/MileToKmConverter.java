import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a distance in miles!");
        double distance = scanner.nextDouble();
        double distanceKm = ((Math.round(distance * 1.60934 * 100)) / 100.0);
        System.out.println("This is " + distanceKm + " in kilometres.");
    }
}

