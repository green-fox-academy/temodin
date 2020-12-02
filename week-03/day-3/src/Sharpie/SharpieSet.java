package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies = new ArrayList<>();

    public int countUsable () {
        int counter = 0;
        for (Sharpie sharpie : sharpies
             ) {
            if(sharpie.inkAmount > 0) {counter++;}
        }
        return counter;
    }
    public void removeTrash() {
        List<Sharpie> temp = new ArrayList<>(sharpies);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).inkAmount == 0) {
                sharpies.remove(i);
            }
        }

    }
}
