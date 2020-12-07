package AircraftCarrier;

public class AircraftF35 extends Aircraft{
    public AircraftF35() {
        this.baseDamage = 50;
        this.maxAmmo = 12;
        this.type = "F35";
        this.currentAmmo = 0;
    }

    @Override
    public boolean isPriority() {
        return true;
    }
}
