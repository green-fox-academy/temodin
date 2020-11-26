import java.util.Scanner;

public class TicTac {

    public static void drawBoard (String[][] board) {
        //draw board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static boolean checkGameEnd (String[][] board) {
        //check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }
        //check columns
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }
        //check diagonals
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        String[][] board = {
                {"[ ]","[ ]","[ ]"},
                {"[ ]","[ ]","[ ]"},
                {"[ ]","[ ]","[ ]"}
        };

        drawBoard(board);

        //set up scanner and variables
        Scanner scanner = new Scanner(System.in);
        int coordinateA;
        int coordinateB;


        //get coordinates
        //userA

        String xCoordPromt = "Enter the x coordinate (1-3)";
        String yCoordPromt = "Enter the x coordinate (1-3)";
        int playerOnTurn = 1;

        System.out.println("Player " + playerOnTurn + "'s turn");
        do { //loop until the coordinates point to an empty cell
        do {System.out.println(xCoordPromt); //loop until input is valid
        coordinateA = scanner.nextInt();}
            while (coordinateA < 1 || coordinateA > 3);
            //System.out.println(userACoordinateA);
        do {System.out.println(yCoordPromt); //loop until input is valid
            coordinateB = scanner.nextInt();}
        while (coordinateB < 1 || coordinateB > 3);}
        while (board [coordinateB-1][coordinateA-1] != "[ ]");

        // add input to the board
        if (playerOnTurn == 1)
        {board [coordinateB-1][coordinateA-1] = "[x]";}
        else {board [coordinateB-1][coordinateA-1] = "[o]";}
        if (playerOnTurn == 1) {playerOnTurn = 2;} else {playerOnTurn = 1};

        /*
        System.out.println("Player 2's turn");
        do { //loop until the coordinates point to an empty cell
        do {System.out.println(xCoordPromt);
            userBCoordinateA = scanner.nextInt();}
        while (userBCoordinateA < 1 || userBCoordinateA > 3);
        //System.out.println(userACoordinateA);
        do {System.out.println(yCoordPromt);
            userBCoordinateB = scanner.nextInt();}
        while (userACoordinateB < 1 || userBCoordinateB > 3);}
        while (board [userBCoordinateB-1][userBCoordinateA-1] != "[ ]");

        // add input to the board
        board [userBCoordinateB-1][userBCoordinateA-1] = "[o]";
*/
        drawBoard(board);

        }
    }
