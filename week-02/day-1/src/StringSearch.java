import java.util.ArrayList;
import java.util.List;

public class StringSearch {

    public static void main(String[] args) {
        Integer a = 556;
        String b = a.toString();
        int index = b.indexOf("6");
        System.out.println(index);

        List <Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        System.out.println(myList.get(0));


    }
}
