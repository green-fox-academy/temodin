package Flyable;

public class Main {

    public static void main(String[] args) {
        Vehicle copter = new Helicopter();
        Flyable flyable1 = (Flyable) copter;
        flyable1.fly();

    }
}
