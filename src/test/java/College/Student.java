package College;

public class Student extends College {
    public String name = "SomeStudent";

    public void printCollegeName(){

        System.out.println(name);
        System.out.println(super.name);
    }

    public void function(){
        System.out.println("printing college");
        super.function();
    }
}
