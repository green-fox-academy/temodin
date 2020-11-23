import java.util.ArrayList;
import java.util.List;

public class Unique {
public static List <Integer> unique (Integer[] myNums) {
   List <Integer> myList = new ArrayList<Integer>();
   myList.add(myNums[0]);
   int duplicateCounter = 0;
    for (int i = 1; i < myNums.length; i++) {
        duplicateCounter = 0;
        for (int j = 0; j < myList.size(); j++) {
           if(myNums[i] == myList.get(j)) {
               duplicateCounter++;
           }
           }
        if(duplicateCounter == 0) {
            myList.add(myNums[i]);
        }
        }
    return myList;
    }
    public static void main(String[] args) {

        System.out.println(unique(new Integer[] {1,1,12,45,67,12}));

    }
}

