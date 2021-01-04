import java.util.Arrays;
import java.util.List;

public class Exercise10 {

    public static void main(String[] args) {


        //Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

//        Write a Stream Expression to find the foxes with green color!
//                Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//                Write a Stream Expression to find the frequency of foxes by color!

        List<Fox> foxes = Arrays.asList(
                new Fox("Paroka","blue",3),
                new Fox("Geza","green",2),
                new Fox("Odon","red",1),
                new Fox("Jakab","orange",4),
                new Fox("Elemer","green",7)
        );
        System.out.println("the foxes with green color are:");
        foxes.stream().filter(f -> f.color.equals("green")).forEach(f -> System.out.println(f.name));
        System.out.println();
        System.out.println("the foxes with green color and under 5 yrs are:");
        foxes.stream().filter(f -> f.color.equals("green") && f.age < 5).forEach(f -> System.out.println(f.name));
        System.out.println();
        String findFoxFrequencyForColor = "green";
        System.out.println("the frequency of " + findFoxFrequencyForColor +" foxes is:");
        System.out.println(foxes.stream().filter(f -> f.color.equals(findFoxFrequencyForColor)).count());


    }
}
