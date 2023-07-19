package Interface;

public class OutputInterface {
    public static void main(String[] args) {
        System.out.println(Student.a);
        Student student = new Student();
        student.printCollegeAddress();
        student.printCollegeName();

    }
}
