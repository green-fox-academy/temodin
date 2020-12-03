package Pirates;

public class Pirate {
    private String name;
    private int numberOfDrinks = 0;
    private boolean isAlive = true;
    private boolean isCaptain = false;

    public Pirate () {
    }

    public Pirate (String name, boolean isCaptain) {
        this.name = name;
        this.isCaptain = isCaptain;
    }

    public void drinkSomeRum() {
        if (isAlive) {numberOfDrinks++;}
        else {
            msgDead();}
    }

    public void getDrunknessLevel() {
        if (isAlive) {numberOfDrinks++;
            System.out.println(numberOfDrinks);}
        else {msgDead();}
    }

    public void howItGoingMate () {
        if (isAlive) {
        if (numberOfDrinks < 5) {
            System.out.println("Pour me anudder!");
        }
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            numberOfDrinks =0;
        }}
        else {  msgDead();}

    }

    public void die ()
    {isAlive = false;}

    public void msgDead() {
        System.out.println("He is dead.");
    }

    public void brawl(Pirate pirateToFightWith) {
        int chance = (int)(Math.random()*3);
        System.out.println(chance);
        switch (chance) {
            case 0:
                die();
                break;
            case 1:
                pirateToFightWith.die();
                break;
            case 2:
                die();
                pirateToFightWith.die();
        }
    }

    public boolean isCaptain () {
        return isCaptain;
    }

    public int numberOfDrinks () {
        return numberOfDrinks;
    }

    public boolean isAlive () {
        return isAlive;
    }

    public void setDead (boolean isAlive) {
        this.isAlive = isAlive;
    }

}


