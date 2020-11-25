import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {

    public static void main(String[] args) {
        List <String> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));

        System.out.println(shoppingList);

        //Do we have milk on the list?
        System.out.println("The fact that we have milk on the shopping list is " + shoppingList.contains("milk"));

        //Do we have bananas on the list?

        System.out.println("The fact that we have bananas on the shopping list is "+ shoppingList.contains("bananas"));






        }
    }


