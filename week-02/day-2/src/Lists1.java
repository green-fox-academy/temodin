import java.util.ArrayList;
import java.util.List;

public class Lists1 {
    public static void main(String[] args) {
        List <String> myNames = new ArrayList<>();

        System.out.println(myNames.size());

        myNames.add("William");

        System.out.println(myNames.isEmpty());

        myNames.add("John");
        myNames.add("Amanda");

        System.out.println(myNames.size());

        System.out.println(myNames.get(2));

        for (String myName : myNames)
            {
                System.out.println(myNames.indexOf(myName) + 1 + ". "  + myName);
        }
        myNames.remove(1);

        for (int i = myNames.size() -1; i >= 0 ; i--) {
            System.out.println(myNames.get(i));
        }

       myNames.removeAll(myNames);
        System.out.println(myNames.size());

    }
}
