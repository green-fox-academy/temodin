import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {

        //draw board
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print("L ");
            }
            System.out.println();
        }

        //set up scanner and variables
        Scanner scanner = new Scanner(System.in);
        int userACoordinateA;
        int userACoordinateB;
        int userBCoordinateA;
        int userBCoordinateB;

        //get coordinates
        //userA
        System.out.println("Player 1's turn");
        do {System.out.println("Enter the first coordinate (1-3)");
        userACoordinateA = scanner.nextInt();}
            while (userACoordinateA < 1 || userACoordinateA > 3);
            //System.out.println(userACoordinateA);
        do {System.out.println("Enter the second coordinate (1-3)");
            userACoordinateB = scanner.nextInt();}
        while (userACoordinateB < 1 || userACoordinateB > 3);
        //userB
        System.out.println("Player 2's turn");
        do {System.out.println("Enter the first coordinate (1-3)");
            userBCoordinateA = scanner.nextInt();}
        while (userBCoordinateA < 1 || userBCoordinateA > 3);
        //System.out.println(userACoordinateA);
        do {System.out.println("Enter the second coordinate (1-3)");
            userBCoordinateB = scanner.nextInt();}
        while (userACoordinateB < 1 || userBCoordinateB > 3);

        

        System.out.println(userACoordinateA);
        System.out.println(userACoordinateB);
        System.out.println(userBCoordinateA);
        System.out.println(userBCoordinateB);

        }
    }
