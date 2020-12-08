package FleetOfThings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aze on 2017.03.29..
 */
public class Fleet {
    public ArrayList<Thing> things = new ArrayList<>();

    public Fleet() {
    }

    public void add(Thing thing) {
        things.add(thing);
    }

    public List getThings () {
        return this.things;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < things.size(); i++) {
            result += (i+1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}