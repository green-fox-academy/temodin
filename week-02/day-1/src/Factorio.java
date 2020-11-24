public class Factorio {

    public static int factorio (int myNum) {
      int subProduct = 1;
        for (int i = 1; i <= myNum ; i++) {
            subProduct *= i;
        }
        return subProduct;
    }

    public static void main(String[] args) {
        System.out.println(factorio(6));
    }
}
