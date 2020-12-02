package PetrolStation;

public class Main {

    public static void main(String[] args) {
    var myCar = new Car();
    var myPetrolStation = new Station();

    myPetrolStation.gasAmount = 1000;
    myPetrolStation.refill(myCar);

        System.out.println(myCar.gasAmount);
        System.out.println(myPetrolStation.gasAmount);
    }
}
