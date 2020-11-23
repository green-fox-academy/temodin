import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How big should be the pyramid like? (whole number)");
        int height = scanner.nextInt();

        for (int i = 1; i <  (height); i++) {//outer loop to print lines
        for (int j = 1 ; j < (height + i); j++) {//length of line is input + 1
            if(j > (height - i)) { // if pixel no is greater than input - rownum then draw star
            System.out.print("*");} else {
                System.out.print(" ");
            }
        }
        System.out.println();}
    }
}

/*      --*
        -***
        *****
        base 5 height 3

        ---*
        --***
        -*****
        *******
        base 7 height 4

        ----*
        ---***
        --*****
        -*******
        *********
        base 9 height 5

        row count -> i < height
        row length -> j < height + i
        isStar -> j > height - i*/


