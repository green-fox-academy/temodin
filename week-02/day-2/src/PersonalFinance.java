
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {

    public static void main(String[] args) {

        List <Integer> expenses = new ArrayList<>();
        expenses.addAll(Arrays.asList(500, 1000, 1250, 175, 800 , 120));

        //How much did we spend?
        int spend = 0;
        for (Integer expense: expenses
             ) { spend += expense;
        };
        System.out.println("We spent " +spend+ " bucks");

        // Which was our greatest expense?
        int greatestExpense = expenses.get(0);
        for (Integer expense: expenses
        ) { if(greatestExpense < expense) {
            greatestExpense = expense;
        };
        };
        System.out.println("Our greatest expense was " +greatestExpense+ " bucks");

        // Which was our lowest expense?
        int lowestExpense = expenses.get(0);
        for (Integer expense: expenses
        ) { if(lowestExpense > expense) {
           lowestExpense = expense;
        };
        };
        System.out.println("Our lowest expense was " +lowestExpense+ " bucks");

        //What was the average amount of our spendings?

        int averageSpend = spend / expenses.size();
        System.out.println("Our average expense was " +averageSpend+ " bucks");

    }
}
/*
    Create a list with the following items.
        500, 1000, 1250, 175, 800 and 120
        Create an application which solves the following problems.
        How much did we spend?
        Which was our greatest expense?
        Which was our cheapest spending?
        What was the average amount of our spendings?
*/

