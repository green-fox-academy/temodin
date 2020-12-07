package TheGarden;

public class Tree extends Plant{
    public Tree(String color, double waterLevel) {
        super(color, waterLevel);
    }

    public Tree(String color) {
        super(color);
    }

    @Override
    public boolean needsWater () {
      if (getWaterLevel() < 10) {
          return true;
      }
      else {
          return false;
      }
    }

    @Override
    public void infoWater () {
        if (needsWater()) {
            System.out.println("The " + this.getColor() + " Tree needs water");

        }
        else {
            System.out.println("The " + this.getColor() + " Tree doesn't need water");

        }
    }

    @Override
    public void waterPlant(double waterAmount) {
        this.setWaterLevel(getWaterLevel() + (waterAmount * 0.4));
    }
}
