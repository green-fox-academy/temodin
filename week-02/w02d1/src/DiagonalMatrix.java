import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        //System.out.println(Arrays.toString(rows));

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {matrix[i][j] = 1;}
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
