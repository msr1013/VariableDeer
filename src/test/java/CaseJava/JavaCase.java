package CaseJava;

import java.util.Scanner;

public class JavaCase {
    public void findDay() {
        System.out.println("Enter day");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch (day) {
            case "Sunday":
                System.out.println("This is sunday");
                break;

            case "Monday":
                System.out.println("This is monday");
                break;

            case "Tuesday":
                System.out.println("This is tuesday");
                break;

            case "Wednesday":
                System.out.println("This is wednesday");
                break;
            default:
                System.out.println("This is thursday or friday or saturday");
        }

    }
}
