import java.util.*;

public class SomePractice {

    public static void main(String[] args) {

        //1. looping longer than an item's size. by adding an additional counter variable that holds the rest of divison by list size
        List<String> myList = new ArrayList<>();
        System.out.println(myList);
        myList.addAll(Arrays.asList("kő", "papír", "olló"));
        System.out.println(myList);

        for (int i = 0; i < 100; i++) {
            int counter = i % myList.size();
            System.out.println(counter + myList.get(counter));
            }
        //2. swap
        int a = 2;
        int b = 3;

        a = b-a; // a=1
        b = b-a; // b=2
        a = a+b; // a=3
        System.out.println("a="+a + "b="+b);

        //3. get a random number without Math.random hassle

        Random random = new Random();
        System.out.println(random.nextInt(836));

        //4.if a string needs to be changed, it must by declared using the Stringbuilder class
        StringBuilder myString = new StringBuilder("kakaós kalács");
        myString.replace(0,6,"vaníliás");
        System.out.println(myString);



    }
}