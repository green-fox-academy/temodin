import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Trees {
    public static void main(String[] args) {
        List<String> trees = new ArrayList<>();
        trees = Arrays.asList("Tree1", "Tree2", "Tree3", "Tree4", "Tree5");

        HashMap<String, String> leafColor = new HashMap<>();
        leafColor.put("Tree1", "dark green");
        leafColor.put("Tree2", "green");
        leafColor.put("Tree3", "dark green");
        leafColor.put("Tree4", "light green");
        leafColor.put("Tree5", "green");

        HashMap<String, String> type = new HashMap<>();
        type.put("Tree1","lime tree");
        type.put("Tree2","oak tree");
        type.put("Tree3","pine");
        type.put("Tree4","baobab");
        type.put("Tree5","sequoia tree");

        HashMap<String, Integer> age = new HashMap<>();
        age.put("lime tree", 35);
        age.put("oak tree", 30);
        age.put("pine", 21);
        age.put("baobab", 7);
        age.put("sequoia tree", 217);

        HashMap<String, String> sex = new HashMap<>();
        leafColor.put("Tree1","male");
        leafColor.put("Tree2","female");
        leafColor.put("Tree3","female");
        leafColor.put("Tree4","female");
        leafColor.put("Tree5","male");

    }

}
