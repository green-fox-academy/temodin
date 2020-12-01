import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap <String, Double> productPriceList = new HashMap<>();
        productPriceList.put("Milk",1.07);
        productPriceList.put("Rice",1.59);
        productPriceList.put("Eggs",3.14);
        productPriceList.put("Cheese",12.60);
        productPriceList.put("Chicken Breasts",9.40);
        productPriceList.put("Apples",2.31);
        productPriceList.put("Tomato",2.58);
        productPriceList.put("Potato",1.75);
        productPriceList.put("Onion",1.10);

       HashMap <String, Integer> shoppingListBob = new HashMap<>();
        shoppingListBob.put("Milk",3);
        shoppingListBob.put("Rice",2);
        shoppingListBob.put("Eggs",2);
        shoppingListBob.put("Cheese",1);
        shoppingListBob.put("Chicken Breasts",4);
        shoppingListBob.put("Apples",1);
        shoppingListBob.put("Tomato",2);
        shoppingListBob.put("Potato",1);

       HashMap <String, Integer> shoppingListAlice = new HashMap<>();
        shoppingListAlice.put("Rice",1);
        shoppingListAlice.put("Eggs",5);
        shoppingListAlice.put("Chicken Breasts",2);
        shoppingListAlice.put("Apples",1);
        shoppingListAlice.put("Tomato",10);

        System.out.println(shoppingListAlice);

        Double billForBob =0.0;
        for (String item : shoppingListBob.keySet()) {
            for (String product : productPriceList.keySet()){
                if (item.equals(product)) {billForBob += shoppingListBob.get(item) * productPriceList.get(product);}
            }
        }

        System.out.println("Bob pays " + billForBob + " bucks");

        Double billForAlice =0.0;
        for (String item : shoppingListAlice.keySet()) {
            for (String product : productPriceList.keySet()){
                if (item.equals(product)) {billForAlice += shoppingListAlice.get(item) * productPriceList.get(product);}
            }
        }

        System.out.println("Alice pays " + billForAlice + " bucks");

        if (shoppingListAlice.get("Rice") > shoppingListBob.get("Rice")) {
            System.out.println("Alice buys more rice");
        }
        if (shoppingListAlice.get("Rice") < shoppingListBob.get("Rice")) {
            System.out.println("Bob buys more rice");
        }
        else {System.out.println("They buy the same amount of rice.");}


        if ((shoppingListAlice.get("Potato")==null?0:shoppingListAlice.get("Potato"))
                < (shoppingListBob.get("Potato")==null?0:shoppingListBob.get("Potato"))) {
            System.out.println("Bob buys more potato");
        }
        else if ((shoppingListAlice.get("Potato")==null?0:shoppingListAlice.get("Potato"))
                > (shoppingListBob.get("Potato")==null?0:shoppingListBob.get("Potato"))) {
            System.out.println("Bob buys more potato");
        }
        else {System.out.println("They buy the same amount of potato.");}

        //who buys more different products?
        if(shoppingListAlice.size() > shoppingListBob.size()) {
            System.out.println("Alice buys more different products");
        }
        else if(shoppingListAlice.size() < shoppingListBob.size()) {
            System.out.println("Bob buys more different products");
        }
        else {
            System.out.println("Both buys the same amount of different products");
        }
        Integer shoppingListBobItemCount = 0;
        Integer shoppingListAliceItemCount = 0;

        //who buys more products?
        for (String item : shoppingListBob.keySet()) {
            shoppingListBobItemCount += shoppingListBob.get(item);
        }
        System.out.println(shoppingListBobItemCount);
        //sum the product pcs with a loop















    }
}
