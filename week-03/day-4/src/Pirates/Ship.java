package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Pirate> crew = new ArrayList<>();

    public void fillShip() {
        crew.add(new Pirate("Johnny",true));
        int noOfCrew = (int) (Math.random()*11);
        for (int i = 0; i < noOfCrew; i++) {
           crew.add(new Pirate());
        }
    }

    public void getCrewmember(int index) {
        this.crew.get(index);
    }

    public int captainNumberOfDrinks() {
        int drinks =0;
        for (Pirate pirate : crew
        ) {if (pirate.isCaptain()){
            drinks = pirate.numberOfDrinks();
            }
    }
    return drinks;}

    public boolean isCaptainAlive() {
       boolean isAlive = true;
        for (Pirate pirate : crew
        ) {if (pirate.isCaptain()){
            isAlive = pirate.isAlive();
        }
        }
        return isAlive;}

    public int countAlive() {
        int aliveCounter = 0;
        for (Pirate pirate : crew
        ) {
            if (pirate.isAlive()) {aliveCounter++;}
        }
        return aliveCounter;
    }

    public void getShipInfo() {
        String captainState = "The captain had " + captainNumberOfDrinks() + " shots. He is " + (isCaptainAlive() ? "alive" : "dead") + ".";
        String crewState = countAlive() + " of the original " + crew.size() + " member crew are alive.";
        System.out.println(captainState + " " + crewState);
    }

    public boolean battle (Ship otherShip) {
        boolean battle;
        if (this.calculateScore() == otherShip.calculateScore()) {
            battle = ((int)(Math.random()*2) == 0);
        } else {
        battle = (this.calculateScore() > otherShip.calculateScore());}

        if (battle) {
            this.party();
            otherShip.loser();
        } else {
            otherShip.party();
            this.loser();
        }

        return battle;
    };

    public int calculateScore() {
        return this.countAlive() - this.captainNumberOfDrinks();
    }

    public void party () {
        int numberOfDrinks = (int) (Math.random()*11);
        for (int i = 0; i < numberOfDrinks; i++) {
                for (Pirate pirate : crew
             ) {
            pirate.drinkSomeRum();
        }
        }
    }

    public void loser () {
        for (Pirate pirate : crew
             ) {
           pirate.setDead((int)(Math.random()*2) == 0);
        }
    }








}
