package TheGarden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plants = new ArrayList<>();

    public void addPlant (Plant plant) {
        this.plants.add(plant);
        plant.infoWater();
    }

    public int countPlantsToWater () {
        int plantsToWater = 0;
        for (Plant plant: plants
             ) {
            if (plant.needsWater()) {plantsToWater++;}
        }
        return plantsToWater;
    }

    public void waterPlants (int waterAmount) {
        System.out.println("Watering with " + waterAmount);

        for (Plant plant : plants
        ) {
            if(plant.needsWater()) {
                plant.waterPlant(waterAmount/countPlantsToWater());}
            plant.infoWater();

        }
    }


}
