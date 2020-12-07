package TheGarden;

public class Flower extends Plant {

    public Flower(String color, double waterLevel) {
        super(color, waterLevel);
    }

    public Flower(String color) {
        super(color);
    }

    @Override
    public boolean needsWater () {
        if (getWaterLevel() < 5) {
            return true;

        }
        else {
            return false;

        }
    }

    @Override
    public void infoWater () {
        if (needsWater()) {
            System.out.println("The " + this.getColor() + " Flower needs water");

        }
        else {
            System.out.println("The " + this.getColor() + " Flower doesn't need water");

        }
    }


    @Override
    public void waterPlant(double waterAmount) {
        this.setWaterLevel(getWaterLevel() + (waterAmount * 0.75));
    }
}
