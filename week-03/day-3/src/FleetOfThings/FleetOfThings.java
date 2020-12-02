package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing myThing1 = new Thing("Get milk");
        Thing myThing2 = new Thing("Remove the obstacles");
        Thing myThing3 = new Thing("Stand up");
        Thing myThing4 = new Thing("Eat lunch");

        myThing3.complete();
        myThing4.complete();

        Fleet myFleet = new Fleet();
        myFleet.add(myThing1);
        myFleet.add(myThing2);
        myFleet.add(myThing3);
        myFleet.add(myThing4);


        System.out.println(myFleet);
    }
}