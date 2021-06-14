package assignment2.ex30.base;

import java.util.Scanner;

public class solution30 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        multiplyTable();
    }


    private static void multiplyTable() {
        int a;
        int b;
        for (a = 1; a <= 12; ++a) {
            for (b = 1; b <= 12; ++b) {
                System.out.printf("%5d", a * b);
            }
            System.out.println(" ");
        }
    }
}
