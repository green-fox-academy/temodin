package TheGarden;

public class Main {

    public static void main(String[] args) {
        Garden garden1 = new Garden();

        garden1.addPlant(new Flower("yellow"));
        garden1.addPlant(new Flower("blue"));
        garden1.addPlant(new Tree("purple"));
        garden1.addPlant(new Tree("orange"));

        garden1.waterPlants(40);
        garden1.waterPlants(70);

    }


}
