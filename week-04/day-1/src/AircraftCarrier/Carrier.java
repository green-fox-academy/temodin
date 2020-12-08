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

    public void addAircraftF16 () {
        this.aircrafts.add(new AircraftF16());
    }
    public void addAircraftF35 () {
        this.aircrafts.add(new AircraftF35());
    }

    public void fill () {
        fillPrioGroup(true);
        fillPrioGroup(false);

    }

    public void fillPrioGroup (boolean priorityToFill) {
        for (Aircraft aircraft : aircrafts
        ) {
            if (aircraft.isPriority() == priorityToFill) {
                if (this.ammoStore >= aircraft.missingAmmo()){
                    this.ammoStore -= aircraft.missingAmmo();
                    aircraft.refill(aircraft.missingAmmo());

                }
                else {aircraft.refill(ammoStore);
                    this.ammoStore = 0;}}
        }
    }

    public void carrierInfo () {
        for (Aircraft aircraft: aircrafts
             ) {
            aircraft.getAircraftProperties();
        }
    }
    }


