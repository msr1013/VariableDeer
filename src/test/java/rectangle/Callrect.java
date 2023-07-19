package rectangle;

import java.util.Scanner;

public class Callrect {
    public static void main(String[] args) {
        Rectanclass rc= new Rectanclass();
        System.out.println("Enter a side");
        Scanner sc = new Scanner(System.in);
        float side1= sc.nextFloat();
        System.out.println("Enter another side");
        float side2 =sc.nextFloat();
        rc.area(side1,side2);
    }
}
