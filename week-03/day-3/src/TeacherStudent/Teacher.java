package TeacherStudent;

public class Teacher {

    public void answer () {
        System.out.println("The teacher is answering a question.");
    }
    public void teach (Student studentToTeach) {
        studentToTeach.learn();
    }
}
