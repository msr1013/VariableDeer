package Variable;

public class VariableProgram {

    // instance variable
    int b = 8;

    //static
    static String course = "java";

    public void localVariableEx() {
        //local variable a
        int a =5;
//        int b =7;

        System.out.println("Value of local variable is:"+a);
        System.out.println("value of instance variable is:"+b);
        System.out.println("value of static variable is:"+course);

    }


}
