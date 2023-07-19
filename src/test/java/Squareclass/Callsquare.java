package Squareclass;

import java.util.Scanner;

public class Callsquare {
    public static void main(String[] args) {
        Squarecal sq = new Squarecal();
        System.out.println("enter a val");
        Scanner sc = new Scanner(System.in);
        float sqaure = (float) sc.nextDouble();
        sq.squarecal(sqaure);
    }

}
