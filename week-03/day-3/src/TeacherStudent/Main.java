package TeacherStudent;

public class Main {
    public static void main(String[] args) {

        Student myStudent = new Student();
        Teacher myTeacher = new Teacher();

        myStudent.question(myTeacher);
        myTeacher.teach(myStudent);

    }

}
