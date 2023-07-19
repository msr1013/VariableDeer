package MultiInherit;

public class ClassImpInt implements Car,Toyota {

    @Override
    public void carName() {
        System.out.println("Toyota");
    }

    @Override
    public void carPrice() {
        System.out.println("price is 100");

    }

    @Override
    public void printCar() {
        System.out.println("car is not printed");

    }
}
