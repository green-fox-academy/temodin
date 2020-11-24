public class Reverse {

    public static String reverse (String stringToReverse) {

        String reversedString = "";

        for (int i = stringToReverse.length() -1; i >= 0; i--) {
           reversedString = reversedString + stringToReverse.charAt(i);

        }
        return reversedString;
    }


    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(toBeReversed));
    }
}
