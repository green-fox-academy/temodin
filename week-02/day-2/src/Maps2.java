import java.util.HashMap;

public class Maps2 {

    public static void main(String[] args) {
        HashMap <String, String> books = new HashMap<>();
        books.put("978-1-60309-452-8","A Letter to Jo");
        books.put("978-1-60309-459-7","Lupus");
        books.put("978-1-60309-444-3","Red Panda and Moon Bear");
        books.put("978-1-60309-461-0","The Lab");

        for (String key : books.keySet()
             ) {
            String title = books.get(key);
            String isbn = "(ISBN: " + key + ")";
            System.out.println(title + " " + isbn);

        }

        books.remove("978-1-60309-444-3");
        books.values().remove("The Lab"); //removing an item based on its value

        System.out.println(books);

        books.put("978-1-60309-450-4","They Called Us Enemy");
        books.put("978-1-60309-453-5","Why Did We Trust Him?");

        System.out.println();

        for (String key : books.keySet()
        ) {
            String title = books.get(key);
            String isbn = "(ISBN: " + key + ")";
            System.out.println(title + " " + isbn);

        }

        System.out.println(books.containsKey("478-0-61159-424-8"));

        System.out.println(books.get("978-1-60309-453-5"));

    }
}
