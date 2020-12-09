public class Fibonacci {

    public int getFibonacciMember(int index) {

        if (index < 2 ) {return index;}

        int i = 1;
        int numA = 0;
        int numB = 1;
        int numC = 0;
        while (i < index) {
            numC = numA + numB;
            numA = numB;
            numB = numC;
            i++;
        }
        return numC;
    }
}
