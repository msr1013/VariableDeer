package Converter;

import java.util.Scanner;

public class Callconvert {
    public static void main(String[] args) {
        Doubletoint di = new Doubletoint();
        System.out.println("Enter the double val");
        Scanner sc = new Scanner(System.in);
        double num=sc.nextDouble();
        di.convert(num);
    }


}
