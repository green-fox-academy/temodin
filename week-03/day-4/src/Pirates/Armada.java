package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> fleet = new ArrayList<>();

    public boolean war (Armada otherArmada) {
        boolean result;
        int thisArmadaCounter = 0;
        int otherArmadaCounter = 0;
        for (int i =0; 1==1; i++) {
            if(this.fleet.get(thisArmadaCounter).battle(otherArmada.fleet.get(otherArmadaCounter))) {
                otherArmadaCounter++;
            } else {thisArmadaCounter++;}
        if (thisArmadaCounter == this.fleet.size()) {
            result = false;
            break;
        } else if (otherArmadaCounter == otherArmada.fleet.size()) {
            result = true;
            break;
        }}
        return result;

        }
        }

