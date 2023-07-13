package TypeCasting;

public class TypeCast {

    public void WideningCasting() {

        int myInt = 5;
        float myFloat = myInt;
        System.out.println(myFloat);

    }

    public void NarrowingCasting() {
        float myVar = 5.6f;
        int myInt = (int) myVar;
        System.out.println(myInt);
    }

}
