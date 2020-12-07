package AircraftCarrier;

public class AircraftF16 extends Aircraft{
    public AircraftF16() {
       this.baseDamage = 30;
       this.maxAmmo = 8;
        this.type = "F16";
        this.currentAmmo = 0;
    }

    @Override
    public boolean isPriority() {
        return false;
    }
}

