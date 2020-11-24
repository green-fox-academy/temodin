public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        int errorIndex = quote.indexOf("It")+2;
        String subString1 = quote.substring(0,errorIndex);
        String subString2 = quote.substring(errorIndex);

        System.out.println(subString1);
        System.out.println(subString2);

        String leftOut = " always takes longer than";

        String correctedString = subString1 + leftOut + subString2;

        System.out.println(correctedString);

    }
}
