package GFOrg;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person () {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public Person (String name, int age) {
        this(name, age,"female");
    }

    public String getName () {
        return this.name;
    }

    public String introduction () {
        return "Hi, I am " + name + " a " + age + " years old " + gender;
    }

    public void introduce() {
        System.out.println(introduction());
    }

    public void getGoal() {
        System.out.println("My goal is : live for the moment!");





    }


}
