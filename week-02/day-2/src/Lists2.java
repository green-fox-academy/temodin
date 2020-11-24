import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists2 {
    public static void main(String[] args) {
        List <String> List_A = new ArrayList<>();
        //add elements by addAll method
        List_A.addAll(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        // alternatively
        // List <String> List_A = Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee");

        List <String> List_B = new ArrayList<>(List_A); //cloning list A into list B

        System.out.println(List_A.contains("Durian"));

        List_B.remove("Durian");

        List_A.add(4,"Kiwifruit");

        System.out.println(List_A);

        if (List_A.size() >= List_B.size()) {
            System.out.println("list A is greater or equal than list B");
        } else {
            System.out.println("list B is greater than list A");
        }

        System.out.println(List_A.indexOf("Avocado"));
        System.out.println(List_B.indexOf("Durian"));

        List_B.addAll(Arrays.asList("Passion Fruit","Pomelo"));

        System.out.println(List_B);
        System.out.println(List_A);

        System.out.println(List_A.get(2));

    }
}
