package ArithmeticSum;

import java.util.Scanner;

public class CallSum {

    public static void main(String[] args) {
        ArithmeticAdd a = new ArithmeticAdd();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an interger");
        int c = sc.nextInt();
        System.out.println("Enter another integer");
        int d = sc.nextInt();
        int b=a.Sum(c,d);
        System.out.println(b);

    }

}
