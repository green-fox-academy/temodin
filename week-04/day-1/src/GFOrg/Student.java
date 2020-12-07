package GFOrg;

public class Student extends Person {
    private String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is : Be a junior software developer");
    }

    @Override
    public void introduce() {
        System.out.println(introduction() + " from " + previousOrganization + " who skipped " + skippedDays + " from the course already");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }


}
