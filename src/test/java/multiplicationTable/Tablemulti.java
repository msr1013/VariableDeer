package multiplicationTable;

import java.util.Scanner;

public class Tablemulti {
    public void calculate() {
        for (int i = 1; i < 10; i++) {
            System.out.println("5" + "*" + i + "=" + 5 * i);

        }

    }

    public static void main(String[] args) {
        Tablemulti tab = new Tablemulti();
        tab.calculate();
    }
}

