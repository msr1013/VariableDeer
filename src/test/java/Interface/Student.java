package Interface;

public class Student implements College {

    @Override
    public void printCollegeName() {
        System.out.println("Deerwalk:");
    }

    @Override
    public void printCollegeAddress() {
        System.out.println("Sifal:");
    }
}
