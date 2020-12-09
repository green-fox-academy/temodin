import java.util.ArrayList;

public class Sum {
    public int sum (ArrayList<Integer> listOfNumbersToAdd) {
        if(listOfNumbersToAdd == null) {
            throw new IllegalArgumentException();
        }

        int sumOfList = 0;
        for (Integer number : listOfNumbersToAdd
             ) {
            sumOfList += number;
        }
        return sumOfList;
    }
}
