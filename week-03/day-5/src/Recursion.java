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


    public static void main(String[] args) {

        //System.out.println(factorial(3));
        //System.out.println(addNumbers(3));
        //System.out.println(sumDigits(66));
        System.out.println(power(3,2));

    }
}
