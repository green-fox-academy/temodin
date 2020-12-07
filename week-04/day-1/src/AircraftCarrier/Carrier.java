package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircrafts = new ArrayList<>();
    int ammoStore;
    int health;

    public Carrier (int ammoStore, int health) {
        this.ammoStore = ammoStore;
        this.health = health;
    }

    public void addAircraft (Aircraft aircraft) {
        this.aircrafts.add(new Aircraft());
    }

    //public void fill

}
