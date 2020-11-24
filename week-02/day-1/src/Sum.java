public class Sum {

    public static int sumTo (int numToSumUntil) {
        int subTotal = 0;
        for (int i = 0; i <= numToSumUntil; i++) {
            subTotal += i;
        }
        return subTotal;
    }

    public static void main(String[] args) {
        System.out.println(sumTo(6));
    }
}
