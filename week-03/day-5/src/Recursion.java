import java.lang.reflect.Array;

public class Recursion {

    public static int factorial(int n) {
     if (n == 1) {
         return 1;
     }
     else {
         return n * factorial(n-1);
     }
    }

    // Write a recursive function that takes one parameter: n and
    // adds numbers from 1 to n.
    public static int addNumbers(int n) {
        if (n == 1) {
            return 1;
        }
    else {
        return n + addNumbers(n-1);
        }
    }

    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    public static int sumDigits (int n) {
      if(n/10 == 0) {
          return n % 10;
      }
      else {
         return n % 10 + sumDigits(n/10);
      }
    };

    // Given base and n that are both 1 or more, compute recursively (no loops) the
    // value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    public static int power (int n, int p) {
       if (p == 0) {
           return 1;
       }
       else {
           return n * power(n,p-1);}
    };

    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).
    public static int bunnyEarCounter(int numberOfBunnies) {

        if (numberOfBunnies == 1) {
            return 2;
        }
        else {
            return 2 + (bunnyEarCounter(numberOfBunnies-1));
        }
    }

    // We have bunnies standing in a line,
    // numbered 1, 2, 3, 4, ...
    // The odd bunnies (1, 3, ...) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears,
    // because they each have a raised foot.
    // Recursively return the number of "ears" in
    // the bunny line 1, 2, ... n (without loops or multiplication).

    public static int bunnyEarAndLegCounter(int numberOfBunnies) {

        if (numberOfBunnies == 1) {
            return 2;
        }
        else if (numberOfBunnies % 2 == 1) {
            return 2 + (bunnyEarAndLegCounter(numberOfBunnies-1));}
        else {return 3 + (bunnyEarAndLegCounter(numberOfBunnies-1));}
    }

    // Given a string, compute recursively (no loops) a new string where
    // all the lowercase 'x' chars have been changed to 'y' chars.
    public static String xToY (String stringToConvert) {
        if (stringToConvert.length() == 0) {
            return "";
        }
        else if (stringToConvert.charAt(stringToConvert.length()-1) == 'x') {
                return xToY(stringToConvert.substring(0,stringToConvert.length()-1)) + "y";
            }
        else {return xToY(stringToConvert.substring(0,stringToConvert.length()-1))+ stringToConvert.charAt(stringToConvert.length()-1) ;}
        }

    // Given a string,
    // compute recursively a new string where
    // all the adjacent chars are now separated by a `*`
    public static String separateWithAsterisk (String stringToConvert) {
        if (stringToConvert.length() == 0) {
            return "";
        }
        else {return separateWithAsterisk(stringToConvert.substring(0,stringToConvert.length()-1)) + stringToConvert.charAt(stringToConvert.length()-1) +"*" ;}
    }


    // Write a function that finds the largest element of an array using recursion.

    public static int findMax (int[] myArray) {

        if (myArray.length == 1) {
            return myArray[0];
        }
        else {
            int[] myArrayOneLess = new int[myArray.length-1];
            int comparisonA = myArray[myArray.length-1];
            int comparisonB = myArray[myArray.length-2];

            for (int i = 0; i < myArray.length-2; i++) {
                myArrayOneLess[i] = myArray[i];
            }

            if (comparisonA >= comparisonB) {
                myArrayOneLess[myArrayOneLess.length-1] = comparisonA;
            }
            else {myArrayOneLess[myArrayOneLess.length-1] = comparisonB;}

            return findMax(myArrayOneLess);
        }
    }



    public static void main(String[] args) {

        //System.out.println(factorial(3));
        //System.out.println(addNumbers(3));
        //System.out.println(sumDigits(66));
        //System.out.println(power(3,2));
        //System.out.println(bunnyEarCounter(5));
        //System.out.println(bunnyEarAndLegCounter(5));
        //System.out.println(xToY("xerxszesz"));
        //System.out.println(separateWithAsterisk("xenia"));
        System.out.println(findMax(new int[] {1,15}));


    }
}
