import java.util.Scanner;

public class TicTac {

    public static int changePlayer (int playerOnTurn) {
        if (playerOnTurn == 1) {
            playerOnTurn = 2;
        } else {
            playerOnTurn = 1;
        }
        return playerOnTurn;
    }

    //function to draw board
    public static void drawBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    //function to check is there is a winner
    public static boolean isThereAWinner(String[][] board) {
        String blank = "[ ]";
        boolean result = false;
        //check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != blank && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                result = true;
            }
        }
        //check columns
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] != blank && board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
                result = true;
            }
        }
        //check diagonals
        if ((board[0][0] != blank && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]))
        || (board[0][2] != blank && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]))) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {

        //declare the game board
        String[][] board = {
                {"[ ]", "[ ]", "[ ]"},
                {"[ ]", "[ ]", "[ ]"},
                {"[ ]", "[ ]", "[ ]"}
        };

        //set up scanner and variables
        Scanner scanner = new Scanner(System.in);
        int coordinateA;
        int coordinateB;
        String xCoordPrompt = "Enter the x coordinate (1-3)";
        String yCoordPrompt = "Enter the y coordinate (1-3)";
        int playerOnTurn = 1;
        boolean isDraw = false;

        //draw board the first time
        drawBoard(board);

        //main loop to play game
        for (int i = 0; i < 9; i++) {

            System.out.println("Player " + playerOnTurn + "'s turn");

            //ask for coordinates. loop until the coordinates point to an empty cell
            do {
                //ask for x coordinate. loop until input is valid
                do {
                    System.out.println(xCoordPrompt);
                    coordinateA = scanner.nextInt();
                }
                while (coordinateA < 1 || coordinateA > 3);
                //ask for y coordinate. loop until input is valid
                do {
                    System.out.println(yCoordPrompt);
                    coordinateB = scanner.nextInt();
                }
                while (coordinateB < 1 || coordinateB > 3);
            }
            while (board[coordinateB - 1][coordinateA - 1] != "[ ]");

            // "draw" input to the board
            if (playerOnTurn == 1) {
                board[coordinateB - 1][coordinateA - 1] = "[x]";
            } else {
                board[coordinateB - 1][coordinateA - 1] = "[o]";
            }

            drawBoard(board);

            if (isThereAWinner(board)) {
                break;
            }

            //draw game indicator.
            if (i == 8) {
                isDraw = true;
            }

            playerOnTurn = changePlayer(playerOnTurn);
        }

        //announce winner
        String winnerAnnouncement;
        if (isDraw) {
            winnerAnnouncement = "Draw game...";
        } else {
            winnerAnnouncement = "Player " + playerOnTurn + " has won the game. Congrats!";
        }
        System.out.println(winnerAnnouncement);
    }
}
