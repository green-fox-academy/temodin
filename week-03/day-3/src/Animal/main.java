package Animal;

public class main {

    public static void main(String[] args) {
    //Animal zebra = new Animal();

    Farm farm1 = new Farm();

        for (int i = 0; i < 3; i++) {
            farm1.breed();
        }

        for (Animal animal : farm1.animals
             ) {
            System.out.println("Hunger " + animal.hunger + " Thirst " + animal.thirst);
        }

        farm1.animals.get(0).eat();
        farm1.animals.get(0).eat();
        farm1.animals.get(0).eat();

        farm1.animals.get(1).eat();
        farm1.animals.get(1).eat();

        farm1.animals.get(2).eat();

        farm1.slaughter();

        for (Animal animal : farm1.animals
        ) {
            System.out.println("Hunger " + animal.hunger + " Thirst " + animal.thirst);
        }

        /*
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

         */
    }
}
