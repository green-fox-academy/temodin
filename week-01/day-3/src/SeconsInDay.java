public class SeconsInDay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remaining = (24 * 60 * 60) -(currentHours * 60 * 60 + currentMinutes * 60 + 42);

        System.out.println(remaining);
    }
}
