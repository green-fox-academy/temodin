package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> fleet = new ArrayList<>();

    public boolean war (Armada otherArmada) {
        int thisArmadaCounter = 0;
        int otherArmadaCounter = 0;
        do {
            if(this.fleet.get(thisArmadaCounter).battle(otherArmada.fleet.get(otherArmadaCounter))) {
                otherArmadaCounter++;
            } else {thisArmadaCounter++;}

        }
        while (thisArmadaCounter != this.fleet.size() || otherArmadaCounter != otherArmada.fleet.size());
        return (thisArmadaCounter == this.fleet.size());

        }
        }

