package TheGarden;

public class Plant {
    private String color;
    private double waterLevel;

    public Plant(String color, double waterLevel) {
        this.color = color;
        this.waterLevel = waterLevel;
    }

    public Plant(String color) {
        this.color = color;
        this.waterLevel = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public boolean needsWater () {
    return true;
    }

    public void waterPlant (double waterAmount) {

    }

    public void infoWater () {};


}
