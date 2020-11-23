public class AppendAFunc {

    public static String appendAFunc (String myString) {
        return myString + "a";
    }

    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));
    }
}
