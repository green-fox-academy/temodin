import java.util.ArrayList;
import java.util.List;

public class SubInt {

    public static List<Integer> subInt (Integer numToSearchFor, Integer[] myArray) {
        String searchString = numToSearchFor.toString(); //transform the num to search into a string
        List <Integer> resultList = new ArrayList<Integer>(); // create a list to store results
        for (int i = 0; i < myArray.length; i++) { // loop through the array
            String nextString = myArray[i].toString();
            if(nextString.indexOf(searchString) != -1) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(subInt(6,new Integer[] {66,12,36,7,556}));

    }
}
