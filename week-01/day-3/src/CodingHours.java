public class CodingHours {
    public static void main(String[] args) {
        int daily = 6;
        int semester = 17;
        int wday = 5;
        System.out.println("Hours coded in a semester per attendee: " + daily * semester * wday);
        int whours = 52;
        System.out.println("percentage of the coding hours in the semester with high precision "+ ((double)daily * semester * wday) / (semester * whours) * 100 + "%");
    }
}
