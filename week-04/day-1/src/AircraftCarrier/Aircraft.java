package AircraftCarrier;

public class Aircraft {
    protected int maxAmmo;
    protected int baseDamage;
    private int currentAmmo;
    protected String type;


    public Aircraft() {
        currentAmmo = 0;
    }

    public void getAircraftProperties () {
        System.out.println("This " + type + " has " +currentAmmo + "/" + maxAmmo + " ammunition and " + baseDamage + " base damage and " + baseDamage *currentAmmo + " total damage" );
    }

    public int fight () {
        int totalDamage = this.currentAmmo * this.baseDamage;
        this.currentAmmo = 0;
        return totalDamage;
    }

    public int refill (int amount) {
       if (amount < (this.maxAmmo - this.currentAmmo)) {
           this.currentAmmo += amount;
           return 0;
       }
       else {this.currentAmmo = this.maxAmmo;
       return (amount - this.maxAmmo);}
    }
    public String getType () {
        return this.type;
    }

    public boolean isPriority () {
        return false;
    }




}
