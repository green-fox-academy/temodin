package PetrolStation;

public class Station {
 int gasAmount;

 public void refill (Car carToRefill) {
    this.gasAmount -= carToRefill.capacity;
    carToRefill.gasAmount = carToRefill.capacity;
 }

}
