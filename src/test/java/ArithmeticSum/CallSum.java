package ArithmeticSum;

import java.util.Scanner;

public class CallSum {

    public static void main(String[] args) {
        ArithmeticAdd a = new ArithmeticAdd();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an name");
        String c = sc.next();
        System.out.println("Enter another string");
        String d = sc.next();
        String b = a.Name(c,d);
        System.out.println(b);


      ;



    }

}
