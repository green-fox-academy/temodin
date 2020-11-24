import java.util.HashMap;

public class Maps1 {
    public static void main(String[] args) {
        HashMap <Integer, Character > myMap = new HashMap<>();
        System.out.println(myMap.size());

        myMap.put(97, 'a');
        myMap.put(98, 'b');
        myMap.put(99, 'c');
        myMap.put(65, 'A');
        myMap.put(66, 'B');
        myMap.put(67, 'C');

        for (int key : myMap.keySet()
             ) {
            System.out.println(key + " " + myMap.get(key));
        }

        myMap.put(68, 'D');

        System.out.println(myMap.size());

        System.out.println(myMap.get(99));

        myMap.remove(97);

        System.out.println(myMap.containsKey(100));

        myMap.clear();

        System.out.println(myMap.size());


    }
}
