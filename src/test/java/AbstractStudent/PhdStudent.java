package AbstractStudent;

public class PhdStudent extends Student {
    private double marks;
    @Override
    public void takeexam() {
        System.out.println("Pdh student taking exam");
    }

    public void getmarks(){
        System.out.println("marks of phd student is"+this.marks);
    }
}
