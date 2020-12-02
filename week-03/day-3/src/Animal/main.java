package Animal;

public class main {

    public static void main(String[] args) {
    Animal zebra = new Animal();

    zebra.drink();
    zebra.drink();
    zebra.drink();

    zebra.eat();
    zebra.eat();
    zebra.eat();
    zebra.eat();
    zebra.eat();

    zebra.play();
    zebra.play();

        System.out.println("Our zebra's hungriness level is "+ zebra.hunger + " and thirstiness level is " + zebra.thirst);
    }
}
