package Triangle;

import java.util.Scanner;

public class Callperim {
    public static void main(String[] args) {
        Perimeter peri= new Perimeter();
        Scanner sc = new Scanner(System.in);
        double[] val = new double[3];
        System.out.println("Enter sides of triangle");
        for(int i=0;i<3;i++){
            val[i]=sc.nextDouble();
        }
        sc.close();
        peri.perimeter(val);
    }
}
