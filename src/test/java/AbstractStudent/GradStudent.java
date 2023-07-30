package AbstractStudent;

public class GradStudent extends Student{
    private double marks;
    @Override
    public void takeexam() {
        System.out.println("grad student taking exam");
    }

    private void getmarks(){
        System.out.println("marks of grad student is"+this.marks);
    }
}
