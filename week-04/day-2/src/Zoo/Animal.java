package Zoo;

public abstract class Animal {
    String name;
    int age;
    String gender;
    boolean isHairy;

    public Animal (String name) {
        this.name = name;
    }

    public abstract String getName();
    public abstract String breed();
}
