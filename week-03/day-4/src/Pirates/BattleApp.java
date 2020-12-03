package Pirates;

public class BattleApp {
    public static void main(String[] args) {

        /*
        var pirate1 = new Pirate("Jack", false);

        pirate1.drinkSomeRum();

        var pirate2 = new Pirate("Joe", false);

        pirate1.brawl(pirate2);

        pirate1.howItGoingMate();
        pirate2.howItGoingMate();

         */

        Ship ship1 = new Ship();
        ship1.fillShip();

        ship1.getShipInfo();

        Ship ship2 = new Ship();
        ship2.fillShip();

        ship1.battle(ship2);

        ship1.getShipInfo();
        ship2.getShipInfo();

    }
}
