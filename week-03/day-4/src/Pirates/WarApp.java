package Pirates;

public class WarApp {

    public static void main(String[] args) {

        Armada armada1 = new Armada();

        armada1.fleet.add(new Ship());
        armada1.fleet.add(new Ship());
        armada1.fleet.get(0).fillShip();
        armada1.fleet.get(1).fillShip();
        armada1.fleet.get(0).getShipInfo();
        armada1.fleet.get(1).getShipInfo();

        Armada armada2 = new Armada();

        armada2.fleet.add(new Ship());
        armada2.fleet.add(new Ship());
        armada2.fleet.get(0).fillShip();
        armada2.fleet.get(1).fillShip();
        armada2.fleet.get(0).getShipInfo();
        armada2.fleet.get(1).getShipInfo();

        System.out.println(armada1.war(armada2));


    }
}
