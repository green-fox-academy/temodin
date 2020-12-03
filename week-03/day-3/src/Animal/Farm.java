package Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals = new ArrayList<>();
    int slots = 10;

    public void breed () {
        if (animals.size() < slots) {
            Animal animal = new Animal();
            animals.add(animal);
        } else {
            System.out.println("Cannot breed");
        }
    }

    public void slaughter () {
        int minHungriness = animals.get(0).hunger;
        Animal leastHungryAnimal = animals.get(0);
        for (Animal animal : animals
             ) {
            if (animal.hunger < minHungriness) {
                minHungriness = animal.hunger;
                leastHungryAnimal = animal;
            }
        }
        animals.remove(leastHungryAnimal);
    }
}
